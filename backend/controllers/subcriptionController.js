const prisma = require('../prisma/prisma')
const SubcriptionUtils = require('../utils/subcriptionUtils')
const catchAsync = require('../utils/catchAsync')
const subcriptionUtil=new SubcriptionUtils()

exports.create = catchAsync(async (req, res) => {
    const data = req.body

    //Check if data exist
    if(!data){
        return res.status(400).json({
            status: 'No data provided'
        })
    }

    //Create Subcription
    const result = await prisma.subcription.create({
        data: {
            duration:data.duration,
            price_per_month:data.price_per_month,
            type:data.type,
            limit_book_mark:data.limit_book_mark,
            book_type:data.book_type??'NORMAL',
            subcription_id:data.subcription_id
        }
    })
    if (!result) {
        return res.status(400).json({
            status: 'Create subcription failed!!!'
        })
    } else {
        return res.status(200).json({
            status: 'Create subcription success!!!'
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

    //Check if subcription exist
    const subcription=await subcriptionUtil.findByID(parseInt(id))
    if(!subcription){
        return res.status(400).json({
            status: 'No subcription found'
        })
    }

    //Delete Subcription
    const result=await prisma.subcription.delete({
        where:{
            id:parseInt(id)
        }
    })
    if (!result) {
        return res.status(400).json({
            status: 'Delete subcription failed!!!'
        })
    } else {
        return res.status(200).json({
            status: 'Delete subcription success!!!'
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

    //Check if subcription exist
    const subcription=await subcriptionUtil.findByID(parseInt(data.id))
    if(!subcription){
        return res.status(400).json({
            status: 'No subcription found'
        })
    }

    //Update subcription
    const result=await prisma.subcription.update({
        where:{
            id:parseInt(data.id)
        },
        data:{
            duration:data.duration??subcription.duration,
            price_per_month:data.price_per_month??subcription.price_per_month,
            type:data.type??subcription.type,
            limit_book_mark:data.limit_book_mark??subcription.limit_book_mark,
            book_type:data.book_type??subcription.book_type,
            subcription_id:data.subcription_id??subcription.subcription_id
        }
    })
    if (!result) {
        return res.status(400).json({
            status: 'Update subcription failed!!!'
        })
    } else {
        return res.status(200).json({
            status: 'Update subcription success!!!'
        })
    }
})

exports.findAll=catchAsync(async (req,res)=>{
    const subcriptions=await prisma.subcription.findMany()
    if (!subcriptions) {
        return res.status(400).json({
            status: 'No subcriptions found !!!'
        })
    } else {
        return res.status(200).json({
            status: 'Find all subcription success !!!',
            subcriptions
        })
    }
})

exports.findByID=catchAsync(async (req,res)=>{
    const {id}=req.params
    if(!id){
        return res.status(400).json({
            status: 'No id provided !!!'
        })
    }

    const subcription=await prisma.subcription.findUnique({
        where:{
            id:parseInt(id)
        }
    })
    if (!subcription) {
        return res.status(400).json({
            status: 'No subcription found !!!'
        })
    } else {
        return res.status(200).json({
            status: 'Subcription search successful',
            subcription
        })
    }
})


