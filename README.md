# ToDoList

## API Documentation
```
http://{{url}}:8080
```

#### Database
```
POSTGRE SQL

"CREATE DATABASE todolist;"
```

#### Category

```
GET http://localhost:8080/category

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
GET http://localhost:8080/category/{id}

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
DELETE http://localhost:8080/category/{id}

Response :
{
  "message": "string"
}
```



