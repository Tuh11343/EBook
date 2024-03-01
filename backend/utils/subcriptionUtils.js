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

  async count(){
    return await prisma.subcription.count({})
  }
}

module.exports = SubcriptionUtils
