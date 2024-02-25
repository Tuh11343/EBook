const prisma = require('../prisma/prisma')

class AuthorUtils {
  constructor() {}

  async findByID(id) {
    return await prisma.author.findFirst({
      where: {
        id:id
      },
    })
  }
}

module.exports = AuthorUtils
