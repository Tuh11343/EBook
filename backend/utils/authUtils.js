const prisma = require('../prisma/prisma');
const bcrypt = require('bcrypt');
const SALT_ROUNDS = 10;

module.exports = class AuthUtils {
  constructor() {}

  getUserByEmail(email) {
    return prisma.account.findFirst({
      where: {
        email: email,
      },
    });
  }

  hashPassword(password) {
    return bcrypt.hashSync(password, SALT_ROUNDS);
  }

  comparePassword(password, hash) {
    return bcrypt.compareSync(password, hash);
  }
};
