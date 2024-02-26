const prisma = require('../prisma/prisma')
const catchAsync = require('../utils/catchAsync')
const BookGenreUtil= require('../utils/bookGenreUtils')
const bookGenreUtil=new BookGenreUtil()

exports.create = catchAsync(async (req, res) => {
    const data = req.body
    if (!data) {
        return res.status(400).json({
            status: 'No data provided'
        })
    }

    const result = await prisma.bookGenre.create({
        data: {
            book_id: data.book_id,
            genres_id: data.genres_id
        }
    })
    if (!result) {
        return res.status(400).json({
            status: 'Create bookGenres failed !!!'
        })
    } else {
        return res.status(200).json({
            status: 'Create bookGenres successful !!!'
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

    const bookGenres=await bookGenreUtil.findByID(parseInt(id))
    if(!bookGenres){
        return res.status(400).json({
            status: 'No bookGenres found'
        })
    }

    const result = await prisma.bookGenre.delete({
        where: {
            id: parseInt(id)
        }
    })
    if (!result) {
        return res.status(400).json({
            status: 'Delete bookGenres failed !!!'
        })
    } else {
        return res.status(200).json({
            status: 'Delete bookGenres successful !!!'
        })
    }
})

exports.update = catchAsync(async (req, res) => {
    const body = req.body
    if (!body) {
        return res.status(400).json({
            status: 'No data provided'
        })
    }
    const bookGenre=await bookGenreUtil.findByID(body.id)
    if(!bookGenre){
        return res.status(400).json({
            status: 'No bookGenre found'
        })
    }

    const result = await prisma.bookGenre.update({
        where: {
            id: parseInt(body.id)
        },
        data: {
            book_id: body.book_id ?? book_id,
            genres_id: body.genres_id ?? genres_id
        }
    })
    if (!result) {
        return res.status(400).json({
            status: 'Update bookGenres failed !!!'
        })
    } else {
        return res.status(200).json({
            status: 'Update bookGenres successful !!!'
        })
    }
})

exports.findAll = catchAsync(async (req, res) => {
    const bookGenres = await prisma.bookGenre.findMany()
    if (!bookGenres) {
        return res.status(400).json({
            status: 'No bookGenres found'
        })
    } else {
        return res.status(200).json({
            status: 'BookGenres search successful',
            bookGenres
        })
    }
})

exports.findByID = catchAsync(async (req, res) => {
    const { id } = req.params
    if (!id) {
        return res.status(400).json({
            status: 'No id provided'
        })
    }

    const bookGenre = await prisma.bookGenre.findUnique({
        where: {
            id: parseInt(id)
        }
    })
    if (!bookGenre) {
        return res.status(400).json({
            status: 'No bookGenres found'
        })
    } else {
        return res.status(200).json({
            status: 'BookGenres search successful',
            bookGenre
        })
    }
})

exports.findByGenreName = catchAsync(async (req, res) => {
    const { name } = req.params
    if (!name) {
        return res.status(400).json({
            status: 'No name provided'
        })
    }

    const bookGenres = await prisma.bookGenre.findMany({
        where: {
            genre:{
                name:{
                    contains:name
                }
            }
        },
        include:{
            genre:true
        }
    })
    if (!bookGenres) {
        return res.status(400).json({
            status: 'No bookGenres found'
        })
    } else {
        return res.status(200).json({
            status: 'BookGenres search successful',
            bookGenres
        })
    }
})

exports.findByBookName = catchAsync(async (req, res) => {
    const { name } = req.params
    if (!name) {
        return res.status(400).json({
            status: 'No name provided'
        })
    }

    const bookGenres = await prisma.bookGenres.findMany({
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
    if (!bookGenres) {
        return res.status(400).json({
            status: 'No bookGenres found'
        })
    } else {
        return res.status(200).json({
            status: 'BookGenres search successful',
            bookGenres
        })
    }
})
