const prisma = require('../prisma/prisma')
const bcrypt = require('bcrypt')
const jwt = require('jsonwebtoken')
const SALT_ROUNDS = 10
const JWT_ACCESS_SECRET_KEY = process.env.JWT_ACCESS_SECRET_KEY
const JWT_REFRESH_SECRET_KEY = process.env.JWT_REFRESH_SECRET_KEY

module.exports = class AuthUtils {
  getUserByEmail (email) {
    return prisma.account.findFirst({
      where: {
        email
      }
    })
  }

  hashPassword (password) {
    return bcrypt.hashSync(password, SALT_ROUNDS)
  }

  comparePassword (password, hash) {
    return bcrypt.compareSync(password, hash)
  }

  signAccessToken (email) {
    return jwt.sign({ email }, JWT_ACCESS_SECRET_KEY, { expiresIn: '24h' })
  }

  signRefreshToken (email) {
    return jwt.sign({ email }, JWT_REFRESH_SECRET_KEY, { expiresIn: '7d' })
  }
}
