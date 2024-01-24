const express = require('express');

const dotenv = require('dotenv');
dotenv.config({ path: './.env' });

const port = process.env.PORT || 5000;

const userRoutes = require('./routes/userRoute');

const app = express();

app.get('/', (req, res) => {
  res.send('Hello World!');
});

app.use('/api/v1/user', userRoutes);

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`);
});
