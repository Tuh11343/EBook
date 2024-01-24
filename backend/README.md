# EBOOK

Mobile app for reading book online

## Introduction

Mobile app for reading book online

## File structure

```
.
├── models
├── routes
│   └── productRoute.js
├── controllers
|   ├── userController.js
│   └── errorController.js
├── configs
|   ├── corsOptions.js
│   └── allowedOrigins.js
├── middlewares
│   └── corsMiddleware.js
├── assets
├── utils
|   ├── appError.js
│   └── catchAsync.js
├── prisma
|   ├── migrations.js
|   ├── prisma.js
│   └── schema.prisma
├── app.js
├── package.json
├── package-lock.json
├── README.md
└── ...
```

## Table of Contents

- [Tech Stack](#techstack)
- [Features](#features)
- [Environment Variables](#environment-variables)
- [Run Locally](#run-)
- [Acknowledgements](#acknowledgements)
- [License](#license)

## Tech Stack

- NodeJS
- Express
- JWT (Authentication)
- MySQL (Database)
- Prisma

## Features

- Will update later

## Environment Variables

To run this project, you will need to add the following environment variables to your .env file

`DATABASE_URL`

`PORT`

## Run Locally

Clone the project

```bash
  git clone https://github.com/Tuh11343/EBook.git
```

Go to the project directory

```bash
  cd backend
```

Install dependencies

```bash
 npm install
```

Migrate prisma

```bash
 prisma generate
```

Start the server

```bash
  npm start
```

## Acknowledgements

- [Express](https://expressjs.com/)
- [JWT Authentication](https://fastapi.tiangolo.com/tutorial/security/oauth2-jwt/)
- [Docker](https://www.docker.com/)

## License

[MIT](https://choosealicense.com/licenses/mit/)

## Support

For support, email onhauyennhi254@gmail.com for supports.
