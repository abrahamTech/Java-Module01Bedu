# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.0/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.0/gradle-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.0/reference/htmlsingle/index.html#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.2.0/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)


## 1.- MODELO

Nota: La clase ENUM es para tener una clase de valores fijos (catalogo)
  
    a) Hacerle sus anotaciones

## 2.- REPOSITORIO

Son una interfaz!!!

## 3.- SERVICIO

Aqui estan los metodos para MOSTRAR todos los Modelos guardados en el repositorio

Y tambien el metodo para GUARDAR un nuevo Modelo en el Repositorio

## 4.- DTO (DTO Normal y Create DTO)

Se crean los 2 DTO: Como es el modelo (DTO) y que vamos a recibir (CreateDTO)

Añadimos las validaciones que van a tener, el de creacion, ya que el usuario pondra esta información

## 5.- MAPPER

Son una interfaz!!!

PAra crear del modelo al DTO

Y para crear de un DTO al modelo

## 6.- CONTROLADOR

Crear las rutas GET y POST

## JSONs Body for Request

### POST Pokemon
{
  "number": 1,
  "name": "Bulbasaur",
  "type": "GRASS"
}

### POST Trainer
{
  "name": "Ash",
}