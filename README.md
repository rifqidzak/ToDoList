# ToDoList

## API Documentation
##### API PORT:
```
http://{{url}}:8080
```
## Database
##### DB PORT:
```
http://{{url}}:5432
```
```
POSTGRE SQL
```
##### Query:
```
CREATE DATABASE todolist;
```
## Category

```http
GET /category
```
##### Response :
```
{
  "data": [
    {
      "code": "string",
      "category": "string",
      "version": 0,
      "id": "string"
    }
  ]
}
```
---------------------------------------------------------------------------------------
```http
GET /category/{id}
```
##### Response :
```
{
  "data": {
    "code": "string",
    "category": "string",
    "version": 0,
    "id": "string"
  }
}
```
---------------------------------------------------------------------------------------
```http
POST /category
```
##### Request Body :
```
{
  "category": "string"
}
```
##### Response :
```
{
  "data": {
    "id": "string"
  },
  "message": "string"
}
```
---------------------------------------------------------------------------------------
```http
PUT /category
```
##### Request Body:
```
{
  "id": "string",
  "category": "string"
}
```
##### Response:
```
{
  "data": {
    "version": 0
  },
  "message": "string"
}
```
---------------------------------------------------------------------------------------
```http
DELETE /category/{id}
```
##### Response :
```
{
  "message": "string"
}
```
---------------------------------------------------------------------------------------
## Activity
```http
GET /activity?active=boolean
```
##### Request Param:
```
active = true (untuk mendapatkan activity yang masih aktif)
active = false (untuk mendapatkan activity yang masih expired atau sudah lewat)
```
##### Response :
```
{
  "data": [
    {
      "id": "string",
      "title": "string",
      "description": "string",
      "startTime": "2023-01-19T03:11:31.697Z",
      "endTime": "2023-01-19T03:11:31.697Z",
      "categoryName": "string",
      "categoryCode": "string",
      "finished": true,
      "isActive": true,
      "version": 0
    }
  ]
}
```
---------------------------------------------------------------------------------------
```http
GET /activity/{id}
```
##### Response :
```
{
  "data": [
    {
      "id": "string",
      "title": "string",
      "description": "string",
      "startTime": "2023-01-19T03:11:31.697Z",
      "endTime": "2023-01-19T03:11:31.697Z",
      "categoryName": "string",
      "categoryCode": "string",
      "finished": true,
      "isActive": true,
      "version": 0
    }
  ]
}
```
---------------------------------------------------------------------------------------
```http
GET /activity/search/search?title=string&active=boolean
```
##### Request Param:
```
active = true (untuk mendapatkan activity yang masih aktif)
active = false (untuk mendapatkan activity yang masih expired atau sudah lewat)
```
##### Response :
```
{
  "data": [
    {
      "id": "string",
      "title": "string",
      "description": "string",
      "startTime": "2023-01-19T03:11:31.697Z",
      "endTime": "2023-01-19T03:11:31.697Z",
      "categoryName": "string",
      "categoryCode": "string",
      "finished": true,
      "isActive": true,
      "version": 0
    }
  ]
}
```
---------------------------------------------------------------------------------------
```http
GET /activity/category?categoryId=string&active=boolean
```
##### Request Param:
```
active = true (untuk mendapatkan activity yang masih aktif)
active = false (untuk mendapatkan activity yang masih expired atau sudah lewat)
```
##### Response :
```
{
  "data": [
    {
      "id": "string",
      "title": "string",
      "description": "string",
      "startTime": "2023-01-19T03:11:31.697Z",
      "endTime": "2023-01-19T03:11:31.697Z",
      "categoryName": "string",
      "categoryCode": "string",
      "finished": true,
      "isActive": true,
      "version": 0
    }
  ]
}
```
---------------------------------------------------------------------------------------
```http
POST /activity
```
##### Request Body :
```
{
  "title": "string",
  "description": "string",
  "startTime": "2023-01-19T03:31:31.076Z",
  "endTime": "2023-01-19T03:31:31.076Z",
  "categoryId": "string"
}
```
##### Response :
```
{
  "data": {
    "id": "string"
  },
  "message": "string"
}
```
---------------------------------------------------------------------------------------
```http
PUT /activity
```
##### Request Body:
```
{
  "title": "string",
  "description": "string",
  "startTime": "2023-01-19T03:37:00.574Z",
  "endTime": "2023-01-19T03:37:00.574Z",
  "finished": true,
  "categoryId": "string",
  "id": "string"
}
```
##### Response:
```
{
  "data": {
    "version": 0
  },
  "message": "string"
}
```
---------------------------------------------------------------------------------------
```http
DELETE /activity/{id}
```
##### Response :
```
{
  "message": "string"
}
```
---------------------------------------------------------------------------------------

