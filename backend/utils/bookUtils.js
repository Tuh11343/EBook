const prisma = require('../prisma/prisma')

class BookUtils {
  constructor() {}

  async findByID(id) {
    return await prisma.book.findFirst({
      where: {
        id:id
      },
    })
  }
}

module.exports = BookUtils
