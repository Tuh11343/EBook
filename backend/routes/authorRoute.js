const express = require('express')
const router = express.Router()
const authorController = require('../controller/authorController')

const authMiddleware = require('../middlewares/authMiddleware')
router.use(authMiddleware.protect)

//Get
router.get('/name/:name', authorController.findByName)
router.get('/', authorController.findAll)
router.get('/id/:id', authorController.findByID)

//Update
router.put('/', authorController.update)

//Create
router.post('/', authorController.create)

//Delete
router.delete('/', authorController.delete)


module.exports = router
