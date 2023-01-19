# ToDoList

## API Documentation
```
http://{{url}}:8080
```
## Database
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
/activity/{id}
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



