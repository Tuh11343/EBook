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

  async count(){
    return await prisma.subcriptionHistory.count({})
  }
}

module.exports = SubcriptionHistoryUtils
