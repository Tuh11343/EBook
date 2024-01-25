const prisma = require('../prisma/prisma')
const bcrypt = require('bcrypt')
const jwt = require('jsonwebtoken')
const twilioClient = require('twilio')(
  'ACd878b6e08f84f12254b22a8ff756fb65',
  'b003c4b64947c4cd0377a00d487ae46d'
)
const SALT_ROUNDS = 10
const JWT_ACCESS_SECRET_KEY = process.env.JWT_ACCESS_SECRET_KEY
const JWT_REFRESH_SECRET_KEY = process.env.JWT_REFRESH_SECRET_KEY

class AuthUtils {
  constructor (email, password) {
    this.email = email
    this.password = password
  }

  async getUserByEmail () {
    return await prisma.account.findFirst({
      where: {
        email: this.email
      }
    })
  }

  hashPassword () {
    return bcrypt.hashSync(this.password, SALT_ROUNDS)
  }

  comparePassword (hash) {
    return bcrypt.compareSync(this.password, hash)
  }

  signAccessToken () {
    return jwt.sign({ email: this.email }, JWT_ACCESS_SECRET_KEY, { expiresIn: '24h' })
  }

  signRefreshToken () {
    return jwt.sign({ email: this.email }, JWT_REFRESH_SECRET_KEY, { expiresIn: '7d' })
  }

  sendOtpSMS () {
    return twilioClient.messages.create({
      body: 'Hello from EBook',
      to: '+84 828 098 274',
      from: '+1 415 801 0474'
    })
  }
}

module.exports = AuthUtils
