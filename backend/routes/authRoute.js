/**
 * @swagger
 * /api/v1/auth/register:
 *   post:
 *     summary: Register account
 *     description: Create an account for user to login into app
 *     produces:
 *       - application/json
 *     requestBody:
 *       required: true
 *       content:
 *         application/json:
 *           schema:
 *             type: object
 *             properties:
 *               name:
 *                 type: string
 *                 description: The user's name.
 *                 example: Leanne Graham
 *     responses:
 *       200:
 *         description: Created
 *         content:
 *           application/json:
 *             schema:
 *               type: object
 *               properties:
 *                 data:
 *                   type: object
 *                   properties:
 *                     id:
 *                       type: integer
 *                       description: The user ID.
 *                       example: 0
 *                     name:
 *                       type: string
 *                       description: The user's name.
 *                       example: Leanne Graham
 *
 * /api/v1/auth/login:
 *   post:
 *     summary: Login account
 *     description: Login and get accessToken to do things
 */

const express = require('express')
const authController = require('../controllers/authController')

const router = express.Router()

router.post('/register', authController.register)
router.post('/login', authController.login)
router.post('/verify-otp', authController.verifyOtp)

module.exports = router
