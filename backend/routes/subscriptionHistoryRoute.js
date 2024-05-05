const express = require('express')
const router = express.Router()
const subcriptionHistoryController = require('../controllers/subcriptionHistoryController')

const authMiddleware = require('../middlewares/authMiddleware')
router.use(authMiddleware.protect)

//Get
router.get('/', subcriptionHistoryController.findAll)
router.get('/id', subcriptionHistoryController.findByID)

//Update
router.put('/', subcriptionHistoryController.update)

//Create
router.post('/', subcriptionHistoryController.create)

//Delete
router.delete('/', subcriptionHistoryController.delete)


module.exports = router
