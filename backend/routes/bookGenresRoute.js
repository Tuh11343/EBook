const express = require('express')
const router = express.Router()
const bookGenresController = require('../controller/bookGenresController')

//Get
router.get('/genresName/:name', bookGenresController.findByGenresName)
router.get('/id/:id', bookGenresController.findByID)
router.get('/', bookGenresController.findAll)
router.get('/bookName/:name', bookGenresController.findByBookName)

//Update
router.put('/', bookGenresController.update)

//Create
router.post('/', bookGenresController.create)

//Delete
router.delete('/', bookGenresController.delete)


module.exports = router