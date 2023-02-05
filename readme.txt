POSTMAN
-----------------------------------------------------------------------
REGISTRATION:
request:
POST (http://localhost:8080/api/v1/auth/register)
body:
{
    "firstname": "ali",
    "lastname": "ali",
    "email": "ali@mail.com",
    "password": "1111"
}

response:
Status:200ok
{
    "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhbGlAbWFpbC5jb20iLCJpYXQiOjE2NzU1NTUzNzYsImV4cCI6MjQxMjc5OTc0MjA3MjE2MH0.eNdvjpD2d9lyCGE5tnLdir80kZ32-ZZV-tgUcknzbEo"
}
----------------------------------------------------------------------------------------------------------------------------
AUTHORIZATION:
POST (http://localhost:8080/api/v1/auth/authenticate)
body:
{
    "email": "ali@mail.com",
    "password": "1111"
}

response:
Status:200ok
{
    "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhbGlAbWFpbC5jb20iLCJpYXQiOjE2NzU1NTUzNzYsImV4cCI6MjQxMjc5OTc0MjA3MjE2MH0.eNdvjpD2d9lyCGE5tnLdir80kZ32-ZZV-tgUcknzbEo"
}
-----------------------------------------------------------------------------------------------------------------
GET (http://localhost:8080/api/v1/demo)
Authorization: Bearer Token
Token: eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhbGlAbWFpbC5jb20iLCJpYXQiOjE2NzU1NTUzNzYsImV4cCI6MjQxMjc5OTc0MjA3MjE2MH0.eNdvjpD2d9lyCGE5tnLdir80kZ32-ZZV-tgUcknzbEo

response:
Status:200ok
body: "Hello from demo end-point"
