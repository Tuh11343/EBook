const express = require('express')
const authMiddleware = require('../middlewares/authMiddleware')
const userController = require('../controllers/userController')

const router = express.Router()
router.use(authMiddleware.protect)

router.get('/', userController.getAllUsers)

module.exports = router
