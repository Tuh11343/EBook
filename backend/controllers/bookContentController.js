const prisma = require('../prisma/prisma')
const BookContentUtils = require('../utils/bookContentUtils')
const catchAsync = require('../utils/catchAsync')

const bookContentUtils = new BookContentUtils()

exports.findAll = catchAsync(async (req, res, next) => {
  const bookContents = await prisma.bookContent.findMany()
  res.status(200).json({
    status: 'success',
    results: bookContents.length,
    data: {
      bookContents,
    },
  })
})

exports.findById = catchAsync(async (req, res, next) => {
  const id = parseInt(req.params.id)
  if (!id) {
    return res.status(400).json({
      status: 'No id provided',
    })
  }
  const bookContent = await bookContentUtils.findByID(id)
  if (!bookContent) {
    return res.status(400).json({
      status: 'Book content not found',
    })
  }
  res.status(200).json({
    status: 'success',
    data: {
      bookContent,
    },
  })
})

exports.findByBookId = catchAsync(async (req, res, next) => {
  const bookId = parseInt(req.params.bookId)
  if (!bookId) {
    return res.status(400).json({
      status: 'No book id provided',
    })
  }
  const bookContents = await bookContentUtils.findByBookId(bookId)
  if (!bookContents) {
    return res.status(400).json({
      status: 'Book content not found',
    })
  }
  res.status(200).json({
    status: 'success',
    data: {
      bookContents,
    },
  })
})

exports.findByTitle = catchAsync(async (req, res, next) => {
  const title = req.params.title
  if (!title) {
    return res.status(400).json({
      status: 'No title provided',
    })
  }
  const bookContent = await bookContentUtils.findByTitle(title)
  if (!bookContent) {
    return res.status(400).json({
      status: 'Book content not found',
    })
  }
  res.status(200).json({
    status: 'success',
    data: {
      bookContent,
    },
  })
})

exports.createBookContent = catchAsync(async (req, res, next) => {
  const data = req.body
  if (!data) {
    return res.status(400).json({
      status: 'No data provided',
    })
  }
  if (data.content && data.content.length > 10000) {
    return res.status(400).json({
      status: 'Content exceeds 10000 characters',
    })
  }
  const bookContentTitleFound = await bookContentUtils.findByTitle(data.title)
  if (bookContentTitleFound) {
    return res.status(400).json({
      status: 'Book content title already exists',
    })
  }
  const bookContent = await prisma.bookContent.create({
    data: {
      title: data.title,
      content: data.content,
      book_id: data.book_id,
      order: data.order,
    },
  })
  return res.status(201).json({
    status: 'success',
    data: {
      bookContent,
    },
  })
})

exports.deleteBookContentById = catchAsync(async (req, res, next) => {
  const id = parseInt(req.params.id)
  if (!id) {
    return res.status(400).json({
      status: 'No id provided',
    })
  }
  const bookContent = await bookContentUtils.findByID(id)
  if (!bookContent) {
    return res.status(400).json({
      status: 'Book content not found',
    })
  }
  const deleteBookContent = await prisma.bookContent.delete({
    where: {
      id: id,
    },
  })
  if (!deleteBookContent) {
    return res.status(400).json({
      status: 'Delete book content failed',
    })
  }
  res.status(200).json({
    status: 'Delete successfully!',
  })
})

exports.updateBookContentById = catchAsync(async (req, res, next) => {
  const id = parseInt(req.params.id)
  if (!id) {
    return res.status(400).json({
      status: 'No id provided',
    })
  }
  const data = req.body
  if (!data) {
    return res.status(400).json({
      status: 'No data provided',
    })
  }
  if (data.content && data.content.length > 10000) {
    return res.status(400).json({
      status: 'Content exceeds 10000 characters',
    })
  }
  const bookContent = await bookContentUtils.findByID(id)
  if (!bookContent) {
    return res.status(400).json({
      status: 'Book content not found',
    })
  }
  const updateBookContent = await prisma.bookContent.update({
    where: {
      id: id,
    },
    data: {
      title: data.title ?? bookContent.title,
      content: data.content ?? bookContent.content,
      book_id: data.book_id ?? bookContent.book_id,
      order: data.order ?? bookContent.order,
    },
  })
  if (!updateBookContent) {
    return res.status(400).json({
      status: 'Update book content failed',
    })
  }
  res.status(200).json({
    status: 'Update successfully!',
  })
})
