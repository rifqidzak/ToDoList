# ToDoList

## API Documentation
```
http://{{url}}:8080
```

### Database
```
POSTGRE SQL
```
```
CREATE DATABASE todolist;
```

### Category

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





