const express=require('express')
const router=express.Router()
const bookController=require('../controller/bookController')

const authMiddleware = require('../middlewares/authMiddleware')
router.use(authMiddleware.protect)

//Get
router.get('/',bookController.findAll)
router.get('/:id',bookController.findByID)
router.get('/name/:name',bookController.findByName)
router.get('/genres/:genresID',bookController.findByGenresID)
router.get('/author/:authorID',bookController.findByAuthorID)

//Delete
router.delete('/:id',bookController.deleteByID)

//Update
router.put('/:id',bookController.updateByID)

//Create
router.post('/',bookController.create)

module.exports=router
