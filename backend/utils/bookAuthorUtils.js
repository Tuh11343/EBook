const prisma = require('../prisma/prisma')

class BookAuthorUtils {
  constructor() {}

  async findByID(id) {
    return await prisma.bookAuthor.findFirst({
      where: {
        id:id
      },
    })
  }
}

module.exports = BookAuthorUtils
