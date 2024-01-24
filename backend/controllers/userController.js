const catchAsync = require('../utils/catchAsync')
const prisma = require('../prisma/prisma')

exports.getAllUsers = catchAsync(async (req, res) => {
  const users = await prisma.user.findMany()
  res.status(200).json({
    status: 'success',
    results: users.length,
    data: {
      users
    }
  })
})

exports.createUser = catchAsync(async (req, res) => {
  const data = req.body

  try {
    let account = await prisma.user.findFirst({
      where: {
        email: data.email
      }
    })

    if (account) {
      res.status(400).json({ message: 'Account already exists' })
    }
    const userPayload = {
      name: data.name,
      address: data.address,
      phoneNumber: data.phoneNumber
    }
    const user = await prisma.user.create({ data: userPayload })

    const accountPayload = {
      email: data.email,
      password: data.password,
      user_id: user.id,
      user: {
        connect: {
          id: user.id
        }
      }
    }
    account = await prisma.account.create({
      data: accountPayload
    })
    res.status(200).json(user)
  } catch (e) {
    res.status(500).json(e)
  }
})
