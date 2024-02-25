const prisma = require('../prisma/prisma')
const AuthorUtils = require('../util/authorUtils')
const catchAsync = require('../util/catchAsync')
const authorUtil=new AuthorUtils()


exports.create = catchAsync(async (req, res) => {
    const data = req.body
    
    //Check if data exist
    if(!data){
        return res.status(400).json({
            status: 'No data provided'
        })
    }

    //Create Author
    const result = await prisma.author.create({
        data: {
            name: data.name,
            description: data.description ?? null,
            image: data.image ?? null,
        }
    })
    if (!result) {
        return res.status(400).json({
            status: 'Create account failed!!!'
        })
    } else {
        return res.status(200).json({
            status: 'Create account success!!!'
        })
    }
})

exports.delete=catchAsync(async (req,res)=>{

    //Check if id exist
    const {id}=req.params
    if(!id){
        return res.status(400).json({
            status: 'No id provided'
        })
    }

    //Check if author exist
    const author=await authorUtil.findByID(parseInt(id))
    if(!author){
        return res.status(400).json({
            status: 'No author found'
        })
    }

    //Delete Author
    const result=await prisma.author.delete({
        where:{
            id:parseInt(id)
        }
    })
    if (!result) {
        return res.status(400).json({
            status: 'Delete author failed!!!'
        })
    } else {
        return res.status(200).json({
            status: 'Delete author success!!!'
        })
    }
})

exports.update=catchAsync(async (req,res)=>{
    const data=req.body

    //Check if data exist
    if(!data){
        return res.status(400).json({
            status: 'No data provided'
        })
    }

    //Check if author exist
    const author=await authorUtil.findByID(parseInt(data.id))
    if(!author){
        return res.status(400).json({
            status: 'No author found'
        })
    }

    //Update author
    const result=await prisma.author.update({
        where:{
            id:parseInt(data.id)
        },
        data:{
            name:data.name,
            description:data.description ?? author.description ?? null,
            image:data.image ?? author.image ?? null,
        }
    })
    if (!result) {
        return res.status(400).json({
            status: 'Update author failed!!!'
        })
    } else {
        return res.status(200).json({
            status: 'Update author success!!!'
        })
    }
})

exports.findAll=catchAsync(async (req,res)=>{
    const authors=await prisma.author.findMany()
    if (!authors) {
        return res.status(400).json({
            status: 'No authors found !!!'
        })
    } else {
        return res.status(200).json({
            status: 'Find all author success !!!',
            data:{
                authors
            }
        })
    }
})

exports.findByID=catchAsync(async (req,res)=>{
    const {id}=req.params
    const author=await prisma.author.findUnique({
        where:{
            id:parseInt(id)
        }
    })
    if (!author) {
        return res.status(400).json({
            status: 'No author found !!!'
        })
    } else {
        return res.status(200).json({
            status: 'Author search successful',
            data:{
                author
            }
        })
    }
})

exports.findByName=catchAsync(async (req,res)=>{
    const {name}=req.params
    const author=await prisma.author.findUnique({
        where:{
            name:{
                contains:name
            }
        }
    })
    if (!author) {
        return res.status(400).json({
            status: 'No author found'
        })
    } else {
        return res.status(200).json({
            status: 'Author search successful',
            data:{
                author
            }
        })
    }
})
