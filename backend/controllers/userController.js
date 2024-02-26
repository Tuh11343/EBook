const catchAsync = require('../utils/catchAsync')
const prisma = require('../prisma/prisma')
const UserUtils = require('../utils/userUtils')

const userUtils = new UserUtils()

exports.getAllUsers = catchAsync(async (req, res) => {
  const users = await prisma.user.findMany()
  res.status(200).json({
    status: 'success',
    results: users.length,
    data: {
      users,
    },
  })
})

exports.getUserById = catchAsync(async (req, res) => {
  const userId = parseInt(req.params.id)
  const user = await userUtils.getUserById(userId)
  if (!user) {
    res.status(400).json({ message: 'User not exists, please create one!' })
  }
  res.status(200).json({ user })
})

exports.deleteUserById = catchAsync(async (req, res) => {
  const userId = parseInt(req.params.id)
  const user = await userUtils.getUserById(userId)
  if (!user) {
    res.status(400).json({ message: 'User not exists, please create one!' })
  }
  const deleteUser = await prisma.user.delete({
    where: {
      id: userId,
    },
  })
  if (deleteUser) {
    res.status(200).json({ message: 'Delete user successfully!' })
  }
})

exports.updateUserById = catchAsync(async (req, res) => {
  const userId = parseInt(req.params.id)
  const data = req.body
  const user = await userUtils.getUserById(userId)
  if (!user) {
    res.status(400).json({ message: 'User not exists, please create one!' })
  }
  const updateUser = await prisma.user.update({
    where: {
      id: userId,
    },
    data: {
      name: data.name,
      phoneNumber: data.phoneNumber,
      address: data.address,
    },
  })
  if (updateUser) {
    res.status(200).json({ updateUser })
  }
})

exports.findUserByName = catchAsync(async (req, res) => {
  const userName = req.params.name
  const user = await userUtils.getUserByName(userName)
  if (!user) {
    res.status(400).json({ message: 'User not exists, please create one!' })
  }
  res.status(200).json({ user })
})
