const catchAsync = require('../utils/catchAsync')
const AppError = require('../utils/appError')
const prisma = require('../prisma/prisma')
const AuthUtils = require('../utils/authUtils')
const firebaseAdmin = require('../configs/firebase')

exports.register = catchAsync(async (req, res, next) => {
  const data = req.body
  const authUtils = new AuthUtils(data.email, data.password)

  try {
    let account = await authUtils.getUserByEmail()
    if (account) {
      res.status(400).json({ message: 'Account already exists' })
      return
    }

    const hashPassword = await authUtils.hashPassword()

    const user = await prisma.user.create({
      data: {
        name: data.name,
        address: data.address,
        phoneNumber: data.phoneNumber,
      },
    })

    account = await prisma.account.create({
      data: {
        email: data.email,
        password: hashPassword,
        user_id: user.id,
      },
    })

    const sendRes = await authUtils.sendOtpSMS()
    // firebaseAdmin
    //   .auth()
    //   .createUser({ uid: data.phoneNumber })
    //   .then((user) => res.send(user))
    //   .then((err) => res.status(422).send({ error: err }))

    res.status(200).json({ message: 'Register successfully!' })
  } catch (e) {
    next(new AppError(e, 500))
  }
})

exports.login = catchAsync(async (req, res, next) => {
  const data = req.body
  const authUtils = new AuthUtils(data.email, data.password)

  try {
    const account = await authUtils.getUserByEmail()
    if (!account) {
      res.status(400).json({ message: 'Account not exists, please create one!' })
      return
    }

    if (!account.is_verified) {
      res.status(400).json({ message: 'Account is not veried!' })
      return
    }

    const isPasswordValid = authUtils.comparePassword(account.password)

    if (!isPasswordValid) {
      res.status(400).json({ message: 'Password is not correct!' })
      return
    }
    const accessToken = authUtils.signAccessToken()
    const refreshToken = authUtils.signRefreshToken()
    res.status(200).json({ accessToken, refreshToken })
  } catch (e) {
    next(new AppError(e, 500))
  }
})
