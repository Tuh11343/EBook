const prisma = require('../prisma/prisma')

class BookContentUtils {
  constructor() {}

  async findByID(id) {
    return await prisma.bookContent.findFirst({
      where: {
        id: id,
      },
    })
  }

  async findByTitle(title) {
    return await prisma.bookContent.findFirst({
      where: {
        title: title,
      },
    })
  }

  async findByBookId(book_id) {
    return await prisma.bookContent.findMany({
      where: {
        book_id: book_id,
      },
    })
  }
}

module.exports = BookContentUtils
