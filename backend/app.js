const express = require('express')
const xss = require('xss-clean')
const hpp = require('hpp')
const dotenv = require('dotenv')
const userRoutes = require('./routes/userRoute')
const authRoutes = require('./routes/authRoute')
const swagger = require('./configs/swagger')
const port = process.env.PORT || 5000
dotenv.config({ path: './.env' })

const app = express()
app.get('/', (req, res) => {
  res.send('Hello World!')
})
app.use(express.json({ limit: '10mb' }))
app.use(xss())
app.use(hpp())
app.use('/api/v1/user', userRoutes)
app.use('/api/v1/auth', authRoutes)
swagger(app)
app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})
