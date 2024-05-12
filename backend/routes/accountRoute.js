const express = require('express')
const authMiddleware = require('../middlewares/authMiddleware')
const accountController = require('../controllers/accountController')

const router = express.Router()
// router.use(authMiddleware.protect)

router.get('/', accountController.getAllAccounts)
router.get('/:id', accountController.getAccountById)
router.delete('/:id', accountController.deleteAccountById)
router.put('/:id', accountController.updateAccountById)
router.get('/get-email/:email', accountController.findAccountByEmail)
router.get('/signIn',accountController.signIn)
router.post('/',accountController.create)
module.exports = router
