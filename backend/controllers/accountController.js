const catchAsync = require('../utils/catchAsync')
const prisma = require('../prisma/prisma')
const AccountUtils = require('../utils/accountUtils')

const accountUtils = new AccountUtils()

exports.getAllAccounts = catchAsync(async (req, res) => {
  const accounts = await prisma.account.findMany()
  res.status(200).json({
    status: 'success',
    results: accounts.length,
    data: {
      accounts,
    },
  })
})

exports.getAccountById = catchAsync(async (req, res) => {
  const accountId = parseInt(req.params.id)
  const account = await accountUtils.getAccountById(accountId)
  if (!account) {
    res.status(400).json({ message: 'Account not exists, please create one!' })
  }
  res.status(200).json({ account })
})

exports.deleteAccountById = catchAsync(async (req, res) => {
  const accountId = parseInt(req.params.id)
  const account = await accountUtils.getAccountById(accountId)
  if (!account) {
    res.status(400).json({ message: 'Account not exists, please create one!' })
  }
  const deleteAccount = await prisma.account.delete({
    where: {
      id: accountId,
    },
  })
  if (deleteAccount) {
    res.status(200).json({ message: 'Delete account successfully!' })
  }
})

exports.updateAccountById = catchAsync(async (req, res) => {
  const accountId = parseInt(req.params.id)
  const data = req.body
  const account = await accountUtils.getAccountById(accountId)
  if (!account) {
    res.status(400).json({ message: 'Account not exists, please create one!' })
  }
  const updateAccount = await prisma.account.update({
    where: {
      id: accountId,
    },
    data: {
      email: data.email,
    },
  })
  if (updateAccount) {
    res.status(200).json({ updateAccount })
  }
})
