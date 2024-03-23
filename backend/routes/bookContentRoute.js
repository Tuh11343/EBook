const express = require('express')
const router = express.Router()
const bookContentController = require('../controllers/bookContentController')

const authMiddleware = require('../middlewares/authMiddleware')
// router.use(authMiddleware.protect)

router.get('/', bookContentController.findAll)
router.get('/:id', bookContentController.findById)
router.get('/find-by-book-id/:book_id', bookContentController.findByBookId)
router.get('/find-by-title/:title', bookContentController.findByTitle)
router.delete('/:id', bookContentController.deleteBookContentById)
router.post('/', bookContentController.createBookContent)
router.put('/:id', bookContentController.updateBookContentById)

module.exports = router
