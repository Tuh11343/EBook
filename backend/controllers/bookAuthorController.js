const prisma = require('../prisma/prisma')
const catchAsync = require('../util/catchAsync')
const BookAuthorUtil= require('../util/bookAuthorUtils')

const bookAuthorUtil=new BookAuthorUtil()

exports.create = catchAsync(async (req, res) => {
    const data = req.body
    if (!data) {
        return res.status(400).json({
            status: 'No data provided'
        })
    }

    const result = await prisma.bookAuthor.create({
        data: {
            book_id: data.book_id,
            author_id: data.author_id
        }
    })
    if (!result) {
        return res.status(400).json({
            status: 'Create bookAuthor failed !!!'
        })
    } else {
        return res.status(200).json({
            status: 'Create bookAuthor success !!!'
        })
    }
})

exports.delete = catchAsync(async (req, res) => {
    const { id } = req.params
    if (!id) {
        return res.status(400).json({
            status: 'No id provided'
        })
    }

    const bookAuthor=await bookAuthorUtil.findByID(parseInt(id))
    if(!bookAuthor){
        return res.status(400).json({
            status: 'No bookAuthor found'
        })
    }

    const result = await prisma.bookAuthor.delete({
        where: {
            id: parseInt(id)
        }
    })
    if (!result) {
        return res.status(400).json({
            status: 'Delete bookAuthor failed !!!'
        })
    } else {
        return res.status(200).json({
            status: 'Delete bookAuthor success !!!'
        })
    }
})

exports.update = catchAsync(async (req, res) => {
    const data = req.body
    if (!data) {
        return res.status(400).json({
            status: 'No data provided'
        })
    }

    const bookAuthor=await bookAuthorUtil.findByID(parseInt(data.id))
    if(!bookAuthor){
        return res.status(400).json({
            status: 'No bookAuthor found'
        })
    }

    const result = await prisma.bookAuthor.update({
        where: {
            id: parseInt(data.id)
        },
        data: {
            book_id: data.book_id ?? bookAuthor.book_id,
            author_id: data.author_id ?? bookAuthor.author_id
        }
    })
    if (!result) {
        return res.status(400).json({
            status: 'Update bookAuthor failed !!!'
        })
    } else {
        return res.status(200).json({
            status: 'Update bookAuthor success !!!'
        })
    }
})

exports.findAll = catchAsync(async (req, res) => {
    const bookAuthor = await prisma.bookAuthor.findMany()
    if (!bookAuthor) {
        return res.status(200).json({
            status: 'No bookAuthor found'
        })
    } else {
        return res.status(200).json({
            status: 'BookAuthor search successful',
            data: {
                bookAuthor
            }
        })
    }
})

exports.findByID = catchAsync(async (req, res) => {
    const { id } = req.params
    const bookAuthor=bookAuthorUtil.findByID(parseInt(id))

    if (!bookAuthor) {
        return res.status(400).json({
            status: 'No bookAuthor found'
        })
    } else {
        return res.status(200).json({
            status: 'BookAuthor search successful',
            data: {
                bookAuthor
            }
        })
    }
})

exports.findByAuthorName = catchAsync(async (req, res) => {
    const { name } = req.params
    if(!name){
        return res.status(400).json({
            status: 'No name provided'
        })
    }

    const bookAuthor = await prisma.bookAuthor.findMany({
        where: {
            author:{
                name:{
                    contains:name
                }
            }
        },
        include:{
            author:true
        }
    })
    if (!bookAuthor) {
        return res.status(400).json({
            status: 'No bookAuthor found'
        })
    } else {
        return res.status(200).json({
            status: 'BookAuthor search successful',
            data: {
                bookAuthor
            }
        })
    }
})

exports.findByBookName = catchAsync(async (req, res) => {
    const { name } = req.params
    if(!name){
        return res.status(400).json({
            status: 'No name provided'
        })
    }

    const bookAuthor = await prisma.bookAuthor.findMany({
        where: {
            book:{
                name:{
                    contains:name
                }
            }
        },
        include:{
            book:true
        }
    })
    if (!bookAuthor) {
        return res.status(400).json({
            status: 'No bookAuthor found'
        })
    } else {
        return res.status(200).json({
            status: 'BookAuthor search successful',
            data: {
                bookAuthor
            }
        })
    }
})
