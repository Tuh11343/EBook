const prisma = require('../prisma/prisma')
const BookUtils = require('../utils/bookUtils')
const catchAsync = require('../utils/catchAsync')
const bookUtil = new BookUtils()

exports.findAll = catchAsync(async (req, res) => {
    const orderBy = req.body.orderBy ?? 'id'
    const books = await prisma.book.findMany({
        orderBy: {
            [orderBy]: 'asc'
        }
    })
    if (!books) {
        return res.status(400).json({
            status: 'No book found',
        })
    } else {
        return res.status(200).json({
            status: 'Book search successful',
            books
        })
    }
})

exports.findByID = catchAsync(async (req, res) => {
    const { id } = req.params

    //Get ID param
    if (!id) {
        return res.status(400).json({
            status: 'No id provided',
        })
    }

    //Find Book
    const book = await prisma.book.findUnique({
        where: {
            id: parseInt(id)
        }
    })
    if (!book) {
        return res.status(400).json({
            status: 'No book found',
        })
    } else {
        return res.status(200).json({
            status: 'Book search successful',
            book
        })
    }
})

exports.findByName = catchAsync(async (req, res) => {
    const { name } = req.params

    if (!name) {
        return res.status(400).json({
            status: 'No name provided'
        })
    }

    const books = await prisma.book.findMany({
        where: {
            OR: [{
                name: {
                    contains: name
                }
            }, {
                bookAuthor: {
                    some: {
                        author: {
                            name: {
                                contains: name
                            }
                        }
                    }
                }
            }
            ]
        },
        include: {
            bookAuthor: true,
        }
    })

    if (!books) {
        return res.status(400).json({
            status: 'No book found'
        })
    } else {
        return res.status(200).json({
            status: 'Book search successful',
            books
        })
    }

})

exports.findByGenresID = catchAsync(async (req, res) => {
    const { genresID } = req.params

    if (!genresID) {
        return res.status(400).json({
            status: 'No id provided'
        })
    }

    const books = await prisma.book.findMany({
        where: {
            bookGenres: {
                some: {
                    genres_id: parseInt(genresID)
                }
            }
        },
        include: {
            bookGenres: true
        }
    })

    if (!books) {
        return res.status(400).json({
            status: 'No book found'
        })
    } else {
        return res.status(200).json({
            status: 'success',
            books
        })
    }
})

exports.findByAuthorID = catchAsync(async (req, res) => {
    const { authorID } = req.params

    if (!authorID) {
        return res.status(400).json({
            status: 'No id provided'
        })
    }

    const books = await prisma.book.findMany({
        where: {
            bookAuthor: {
                some: {
                    author_id: parseInt(authorID)
                }
            }
        },
        include: {
            bookAuthor: true
        }
    })

    if (!books) {
        return res.status(400).json({
            status: 'No book found'
        })
    } else {
        return res.status(200).json({
            status: 'Book search successful',
            books
        })
    }
})

exports.deleteByID = catchAsync(async (req, res) => {
    const { id } = req.params
    if (!id) {
        return res.status(400).json({
            status: 'No id provided'
        })
    }

    const book = await bookUtil.findByID(parseInt(id))
    if (!book) {
        return res.status(400).json({
            status: 'No book found'
        })
    }

    const result = await prisma.book.delete({
        where: {
            id: parseInt(id)
        }
    })
    if (result) {
        return res.status(200).json({
            status: 'Book delete successful !!!',
        })
    } else {
        return res.status(400).json({
            status: 'Book delete failed !!!'
        })
    }

})

exports.updateByID = catchAsync(async (req, res) => {
    const data = req.body
    if (!data) {
        return res.status(400).json({
            status: 'No data provided'
        })
    }

    const book=await bookUtil.findByID(parseInt(data.id))
    if(!book){
        return res.status(400).json({
            status: 'No book found'
        })
    }

    const result = await prisma.book.update({
        where: {
            id: parseInt(data.id)
        },
        data: {
            name: data.name,
            description: data.description ?? book.description ?? null,
            rating: data.rating ?? book.rating ?? 0,
            progress: data.progress ?? book.progress ?? 0,
            published_year: data.published_year,
            image: data.image ?? data.image ?? null,
            language: data.language ?? data.language ?? null,
            book_type: data.book_type ?? book_type ?? 'NORMAL',
        }
    })
    if (result) {
        return res.status(200).json({
            status: 'Book update successful',
        })
    } else {
        return res.status(400).json({
            status: 'Book update failed',
        })
    }
})

exports.create = catchAsync(async (req, res) => {
    const data = req.body
    if (!data) {
        return res.status(400).json({
            status: 'No data provided'
        })
    }

    const result = await prisma.book.create({
        data: {
            name: data.name,
            description: data.description ?? null,
            rating: data.rating ?? 0,
            progress: data.progress ?? 0,
            published_year: data.published_year,
            image: data.image ?? null,
            language: data.language ?? "Unknown",
            book_type: data.book_type ?? 'NORMAL',
        }
    })
    if (!result) {
        return res.status(400).json({
            status: 'Create book successful'
        })
    } else {
        return res.status(200).json({
            status: 'Create book failed'
        })
    }
})
