const express = require('express')
const router = express.Router()
const subcriptionController = require('../controllers/subcriptionController')

const authMiddleware = require('../middlewares/authMiddleware')
router.use(authMiddleware.protect)

//Get
router.get('/', subcriptionController.findAll)
router.get('/id/:id', subcriptionController.findByID)

//Update
router.put('/', subcriptionController.update)

//Create
router.post('/', subcriptionController.create)

//Delete
router.delete('/', subcriptionController.delete)


module.exports = router
