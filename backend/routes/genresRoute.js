const express = require('express')
const router = express.Router()
const genresController = require('../controller/genresController')

const authMiddleware = require('../middlewares/authMiddleware')
router.use(authMiddleware.protect)

//Get
router.get('/name/:name', genresController.findByName)
router.get('/', genresController.findAll)
router.get('/id/:id', genresController.findByID)

//Update
router.put('/', genresController.update)

//Create
router.post('/', genresController.create)

//Delete
router.delete('/', genresController.delete)


module.exports = router
