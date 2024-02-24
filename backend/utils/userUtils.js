const prisma = require('../prisma/prisma')

class UserUtils {
  constructor() {}

  async getAccountById(id) {
    return await prisma.user.findFirst({
      where: {
        id: id,
      },
    })
  }
}

module.exports = UserUtils
