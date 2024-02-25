const prisma = require('../prisma/prisma')

class BookGenresUtils {
  constructor() {}

  async findByID(id) {
    return await prisma.bookGenres.findFirst({
      where: {
        id:id
      },
    })
  }
}

module.exports = BookGenresUtils
