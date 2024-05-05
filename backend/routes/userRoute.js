const express = require('express')
const authMiddleware = require('../middlewares/authMiddleware')
const userController = require('../controllers/userController')

const router = express.Router()
// router.use(authMiddleware.protect)

router.get('/', userController.getAllUsers)
router.get('/:id', userController.getUserById)
router.delete('/:id', userController.deleteUserById)
router.put('/:id', userController.updateUserById)
router.get('/get-name/:name', userController.findUserByName)

module.exports = router
