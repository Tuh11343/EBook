const prisma = require('../prisma/prisma')

class GenreUtils {
  constructor() {}

  async findByID(id) {
    return await prisma.genre.findFirst({
      where: {
        id:id
      },
    })
  }
}

module.exports = GenreUtils
