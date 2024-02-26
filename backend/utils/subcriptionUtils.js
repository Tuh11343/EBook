const prisma = require('../prisma/prisma')

class SubcriptionUtils {
  constructor() {}

  async findByID(id) {
    return await prisma.subcription.findFirst({
      where: {
        id:id
      },
    })
  }
}

module.exports = SubcriptionUtils
