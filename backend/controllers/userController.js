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
