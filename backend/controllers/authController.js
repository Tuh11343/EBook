const catchAsync = require('../utils/catchAsync');
const AppError = require('../utils/appError');
const prisma = require('../prisma/prisma');
const authUtils = require('../utils/authUtils');

exports.register = catchAsync(async (req, res, next) => {
  const data = req.body;
  try {
    let account = await new authUtils().getUserByEmail(data.email);
    if (account) {
      res.status(400).json({ message: 'Account already exists' });
      return;
    }

    const hashPassword = await new authUtils().hashPassword(data.password);

    let user = await prisma.user.create({
      data: {
        name: data.name,
        address: data.address,
        phoneNumber: data.phoneNumber,
      },
    });

    account = await prisma.account.create({
      data: {
        email: data.email,
        password: hashPassword,
        user_id: user.id,
      },
    });
    res.status(200).json({ message: 'Register successfully!' });
  } catch (e) {
    next(new AppError(e, 500));
  }
});

exports.login = catchAsync(async (req, res, next) => {
  const data = req.body;
  try {
    let account = await new authUtils().getUserByEmail(data.email);
    if (!account) {
      res.status(400).json({ message: 'Account not exists, please create one!' });
      return;
    }
    const isPasswordValid = await new authUtils().comparePassword(data.password, account.password);
    if (!isPasswordValid) {
      res.status(400).json({ message: 'Password is not correct!' });
      return;
    }
    res.status(200).json({ message: 'Login successfully!' });
  } catch (e) {
    next(new AppError(e, 500));
  }
});
