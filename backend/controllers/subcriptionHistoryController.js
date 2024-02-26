const prisma = require('../prisma/prisma')
const SubcriptionHistoryUtils = require('../utils/subcriptionHistoryUtils')
const catchAsync = require('../utils/catchAsync')
const subcriptionHistoryUtil = new SubcriptionHistoryUtils()

exports.create = catchAsync(async (req, res) => {
    const data = req.body

    //Check if data exist
    if (!data) {
        return res.status(400).json({
            status: 'No data provided'
        })
    }

    //Create SubcriptionHistory
    const result = await prisma.subcriptionHistory.create({
        data: {
            name: data.name,
            price: data.price,
            start: data.start,
            end: data.end,
        }
    })
    if (!result) {
        return res.status(400).json({
            status: 'Create subcriptionHistory failed!!!'
        })
    } else {
        return res.status(200).json({
            status: 'Create subcriptionHistory success!!!'
        })
    }
})

exports.delete = catchAsync(async (req, res) => {

    //Check if id exist
    const { id } = req.params
    if (!id) {
        return res.status(400).json({
            status: 'No id provided'
        })
    }

    //Check if subcriptionHistory exist
    const subcriptionHistory = await subcriptionHistoryUtil.findByID(parseInt(id))
    if (!subcriptionHistory) {
        return res.status(400).json({
            status: 'No subcriptionHistory found'
        })
    }

    //Delete SubcriptionHistory
    const result = await prisma.subcriptionHistory.delete({
        where: {
            id: parseInt(id)
        }
    })
    if (!result) {
        return res.status(400).json({
            status: 'Delete subcriptionHistory failed!!!'
        })
    } else {
        return res.status(200).json({
            status: 'Delete subcriptionHistory success!!!'
        })
    }
})

exports.update = catchAsync(async (req, res) => {
    const data = req.body

    //Check if data exist
    if (!data) {
        return res.status(400).json({
            status: 'No data provided'
        })
    }

    //Check if subcriptionHistory exist
    const subcriptionHistory = await subcriptionHistoryUtil.findByID(parseInt(data.id))
    if (!subcriptionHistory) {
        return res.status(400).json({
            status: 'No subcriptionHistory found'
        })
    }

    //Update subcriptionHistory
    const result = await prisma.subcriptionHistory.update({
        where: {
            id: parseInt(data.id)
        },
        data: {
            name: data.name ?? subcriptionHistory.name,
            price: data.price ?? subcriptionHistory.price,
            start: data.start ?? subcriptionHistory.start,
            end: data.end ?? subcriptionHistory.end,
        }
    })
    if (!result) {
        return res.status(400).json({
            status: 'Update subcriptionHistory failed!!!'
        })
    } else {
        return res.status(200).json({
            status: 'Update subcriptionHistory success!!!'
        })
    }
})

exports.findAll = catchAsync(async (req, res) => {
    const subcriptionHistorys = await prisma.subcriptionHistory.findMany()
    if (!subcriptionHistorys) {
        return res.status(400).json({
            status: 'No subcriptionHistorys found !!!'
        })
    } else {
        return res.status(200).json({
            status: 'Find all subcriptionHistory success !!!',
            subcriptionHistorys
        })
    }
})

exports.findByID = catchAsync(async (req, res) => {
    const { id } = req.params
    if (!id) {
        return res.status(400).json({
            status: 'No id provided !!!'
        })
    }

    const subcriptionHistory = await prisma.subcriptionHistory.findUnique({
        where: {
            id: parseInt(id)
        }
    })
    if (!subcriptionHistory) {
        return res.status(400).json({
            status: 'No subcriptionHistory found !!!'
        })
    } else {
        return res.status(200).json({
            status: 'SubcriptionHistory search successful',
            subcriptionHistory
        })
    }
})


