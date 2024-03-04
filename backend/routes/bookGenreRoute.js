const express = require('express')
const router = express.Router()
const bookGenresController = require('../controller/bookGenresController')

const authMiddleware = require('../middlewares/authMiddleware')
router.use(authMiddleware.protect)

//Get
router.get('/genresName', bookGenresController.findByGenresName)
router.get('/id', bookGenresController.findByID)
router.get('/', bookGenresController.findAll)
router.get('/bookName', bookGenresController.findByBookName)

//Update
router.put('/', bookGenresController.update)

//Create
router.post('/', bookGenresController.create)

//Delete
router.delete('/', bookGenresController.delete)


module.exports = router