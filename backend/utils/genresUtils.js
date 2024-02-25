const prisma = require('../prisma/prisma')

class GenresUtils {
  constructor() {}

  async findByID(id) {
    return await prisma.genres.findFirst({
      where: {
        id:id
      },
    })
  }
}

module.exports = GenresUtils
