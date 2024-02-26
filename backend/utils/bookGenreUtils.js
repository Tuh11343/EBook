const prisma = require('../prisma/prisma')

class BookGenreUtils {
  constructor() {}

  async findByID(id) {
    return await prisma.bookGenre.findFirst({
      where: {
        id:id
      },
    })
  }
}

module.exports = BookGenreUtils
