const prisma = require('../prisma/prisma')
const catchAsync = require('../utils/catchAsync')
const GenreUtil=require('../utils/genreUtils')

const genreUtil=new GenreUtil()

exports.create = catchAsync(async (req, res) => {
    const data = req.body
    if (!data) {
        return res.status(400).json({
            status: 'No data provided'
        })
    }

    const result = await prisma.genre.create({
        data: {
            name: data.name,
        }
    })
    if (!result) {
        return res.status(400).json({
            status: 'Create genres failed !!!'
        })
    } else {
        return res.status(200).json({
            status: 'Create genres successful !!!'
        })
    }
})

exports.delete=catchAsync(async (req,res)=>{
    const {id}=req.params
    if(!id){
        return res.status(400).json({
            status: 'No id provided'
        })
    }

    const genre=await genreUtil.findByID(parseInt(id))
    if(!genre){
        return res.status(400).json({
            status: 'No genres found'
        })
    }

    const result=await prisma.genre.delete({
        where:{
            id:parseInt(id)
        }
    })
    if (!result) {
        return res.status(400).json({
            status: 'Delete genres failed !!!'
        })
    } else {
        return res.status(200).json({
            status: 'Delete genres successful !!!'
        })
    }
})

exports.update=catchAsync(async (req,res)=>{
    const data=req.body
    if(!data){
        return res.status(400).json({
            status: 'No data provided'
        })
    }

    const genre=await genreUtil.findByID(parseInt(data.id))
    if(!genre){
        return res.status(400).json({
            status: 'No genres found'
        })
    }

    const result=await prisma.genre.update({
        where:{
            id:parseInt(data.id)
        },
        data:{
            name:data.name,
        }
    })
    if (!result) {
        return res.status(400).json({
            status: 'Update genres failed !!!'
        })
    } else {
        return res.status(200).json({
            status: 'Update genres successful !!!'
        })
    }
})

exports.findAll=catchAsync(async (req,res)=>{
    const genres=await prisma.genre.findMany()
    if (!genres) {
        return res.status(400).json({
            status: 'No genres found'
        })
    } else {
        return res.status(200).json({
            status: 'Genres search successful',
            genres
        })
    }
})

exports.findByID=catchAsync(async (req,res)=>{
    const {id}=req.params
    if(!id){
        return res.status(400).json({
            status: 'No id provided'
        })
    }

    const genre=await prisma.genres.findUnique({
        where:{
            id:parseInt(id)
        }
    })
    if (!genre) {
        return res.status(400).json({
            status: 'No genre found'
        })
    } else {
        return res.status(200).json({
            status: 'Genre search successful',
            genre
        })
    }
})

exports.findByName=catchAsync(async (req,res)=>{
    const {name}=req.params
    if(!name){
        return res.status(400).json({
            status: 'No name provided'
        })
    }

    const genres=await prisma.genres.findUnique({
        where:{
            name:{
                contains:name
            }
        }
    })
    if (!genres) {
        return res.status(400).json({
            status: 'No genres found'
        })
    } else {
        return res.status(200).json({
            status: 'Genres search successful',
            genres
        })
    }
})
