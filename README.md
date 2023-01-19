# ToDoList

## API Documentation
```
http://{{url}}:8080
```

#### Database
```
POSTGRE SQL
```
"CREATE DATABASE todolist;"
```

#### Category

```
GET /category

Response :
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
```
GET /category/{id}

Response :
{
  "data": {
    "code": "string",
    "category": "string",
    "version": 0,
    "id": "string"
  }
}
```

```
POST /category
Request Body :
{
  "category": "string"
}

Response :
{
  "data": {
    "id": "string"
  },
  "message": "string"
}
```

```
PUT /category
Request Body:
{
  "id": "string",
  "category": "string"
}

Response:
{
  "data": {
    "version": 0
  },
  "message": "string"
}
```

```
DELETE /category/{id}

Response :
{
  "message": "string"
}
```





