## Connection with MongoDB

### Connection File

The connection id's are in `application.properties`

When you get the connection String from MongoDB:
`mongodb+srv://user:password@cluster0.bpsttkh.mongodb.net/?retryWrites=true&w=majority`

Need to write the name of the Database: `session09`
spring.data.mongodb.uri=mongodb+srv://user:password@cluster0.bpsttkh.mongodb.net/**session09**?retryWrites=true&w=majority



### Enviar la Solicitud

- Registrar Usuario:

Metodo POST:
`http://localhost:8080/empleados`

- Body:
```bash
{
"id": "1",
"nombre": "John"
}
```

- Consultar los Usuarios:

Metodo GET:
`http://localhost:8080/empleados`


- Consultar un Usuario (/ID):

Metodo GET:
`http://localhost:8080/empleados/1`


### Validacion de usuario


NO crear usuario si ya existe uno con el mismo **ID**

- Mensaje de Error 500

```bash
{
  "timestamp": "2023-11-02T02:18:53.413+0000",
  "path": "/empleados",
  "status": 500,
  "error": "Internal Server Error",
  "message": "Empleado con el id 1 ya existe!!!",
  "requestId": "f9dc373d"
}
```


### Actualizar Usuarios

- Actualizar Usuario (/ID):

Metodo PUT:
`http://localhost:8080/empleados/1`

- Body:
```bash
{
"id": "1",
"nombre": "newName"
}
```

Si no existe el usuario con el **ID** que se ingreso para ACTUALIZAR su informacion

- Mensaje de Error 500

```bash
{
  "timestamp": "2023-11-02T02:24:19.846+0000",
  "path": "/empleados/5",
  "status": 500,
  "error": "Internal Server Error",
  "message": "El empleado no existe",
  "requestId": "ca04271e"
}
```

### Eliminar Usuario

- Eliminar Usuario (/ID):

Metodo DELETE:
`http://localhost:8080/empleados/1`


Si no existe el usuario con el **ID** que se ingreso para ELIMINAR

- Mensaje de Error 500

```bash
{
  "timestamp": "2023-11-02T02:34:51.642+0000",
  "path": "/empleados/5",
  "status": 500,
  "error": "Internal Server Error",
  "message": "El empleado no existe",
  "requestId": "25136f11"
}
```
### Registrar Entrada Usuario

- Registrar Entrada Usuario:

Metodo POST:
`http://localhost:8080/empleados/checador`

- Body:
```bash
{
  "empleado": {
    "id": 1,
    "nombre": "John"
  },
  "esEntrada": true
}
```

### Filtrar por Entrada o Salida de Usuario

Valores de Entrada y Salida en la URL
Entrada: 1
Salida: 0

```bash
http://localhost:8080/empleados/checador/{empleadoId}/{esEntrada}
```

- Filtrar SALIDA de Usuario 1:

Metodo GET:
`http://localhost:8080/empleados/checador/1/0`

- Filtrar ENTRADA de Usuario 1:

Metodo GET:
`http://localhost:8080/empleados/checador/1/1`
