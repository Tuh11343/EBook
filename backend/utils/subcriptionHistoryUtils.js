const prisma = require('../prisma/prisma')

class SubcriptionHistoryUtils {
  constructor() {}

  async findByID(id) {
    return await prisma.subcriptionHistory.findFirst({
      where: {
        id:id
      },
    })
  }
}

module.exports = SubcriptionHistoryUtils
