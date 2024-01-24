const catchAsync = require('../utils/catchAsync')
const AppError = require('../utils/appError')
const prisma = require('../prisma/prisma')
const AuthUtils = require('../utils/authUtils')

exports.register = catchAsync(async (req, res, next) => {
  const data = req.body
  try {
    let account = await new AuthUtils().getUserByEmail(data.email)
    if (account) {
      res.status(400).json({ message: 'Account already exists' })
      return
    }

    const hashPassword = await new AuthUtils().hashPassword(data.password)

    const user = await prisma.user.create({
      data: {
        name: data.name,
        address: data.address,
        phoneNumber: data.phoneNumber
      }
    })

    account = await prisma.account.create({
      data: {
        email: data.email,
        password: hashPassword,
        user_id: user.id
      }
    })
    res.status(200).json({ message: 'Register successfully!' })
  } catch (e) {
    next(new AppError(e, 500))
  }
})

exports.login = catchAsync(async (req, res, next) => {
  const data = req.body
  try {
    const account = await new AuthUtils().getUserByEmail(data.email)
    if (!account) {
      res.status(400).json({ message: 'Account not exists, please create one!' })
      return
    }
    const isPasswordValid = await new AuthUtils().comparePassword(data.password, account.password)
    if (!isPasswordValid) {
      res.status(400).json({ message: 'Password is not correct!' })
      return
    }
    const accessToken = await new AuthUtils().signAccessToken(data.email)
    const refreshToken = await new AuthUtils().signRefreshToken(data.email)
    res.status(200).json({ accessToken, refreshToken })
  } catch (e) {
    next(new AppError(e, 500))
  }
})
