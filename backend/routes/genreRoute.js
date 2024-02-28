const express = require('express')
const router = express.Router()
const genreController = require('../controllers/genreController')

const authMiddleware = require('../middlewares/authMiddleware')
// router.use(authMiddleware.protect)

//Get
router.get('/name/:name', genreController.findByName)
router.get('/', genreController.findAll)
router.get('/id/:id', genreController.findByID)

//Update
router.put('/', genreController.update)

//Create
router.post('/', genreController.create)

//Delete
router.delete('/', genreController.delete)


module.exports = router
