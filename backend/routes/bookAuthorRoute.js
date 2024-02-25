const express = require('express')
const router = express.Router()
const bookAuthorController = require('../controller/bookAuthorController')

//Get
router.get('/authorName/:name', bookAuthorController.findByAuthorName)
router.get('/id/:id', bookAuthorController.findByID)
router.get('/', bookAuthorController.findAll)
router.get('/bookName/:name', bookAuthorController.findByBookName)

//Update
router.put('/', bookAuthorController.update)

//Create
router.post('/', bookAuthorController.create)

//Delete
router.delete('/', bookAuthorController.delete)


module.exports = router