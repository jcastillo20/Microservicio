# Microservicios 

Este es un microservicio de Cliente desarrollado como Reto Técnico con las siguientes dependencias:

##### H2 Database: 

La base de datos H2 es un sistema de gestión de base de datos relacional de código abierto, integrado y en memoria. Está escrito en Java y proporciona una aplicación cliente/servidor. Almacena datos en la memoria del sistema en lugar de en el disco.

##### Spring Data JPA:

Spring Data JPA, parte de la familia Spring Data más grande, facilita la implementación de repositorios basados ​​en JPA. Este módulo trata sobre el soporte mejorado para las capas de acceso a datos basadas en JPA. 

##### Spring Web:

La dependencia spring-web contiene utilidades comunes específicas de la web para entornos Servlet y Portlet , mientras que spring-webmvc habilita la compatibilidad con MVC para entornos Servlet.

##### Spring Boot DevTools:

El objetivo del módulo es intentar mejorar el tiempo de desarrollo mientras se trabaja con la aplicación Spring Boot. Spring Boot DevTools recoge los cambios y reinicia la aplicación.

##### Validation:

La función de validación de métodos admitida por Bean Validation 1.1 se habilita automáticamente siempre que haya una implementación JSR-303 (como el validador de Hibernate) en el classpath. Esto permite que los métodos de bean se anoten con javax.validationrestricciones en sus parámetros y/o en su valor de retorno.

##### Swagger:

Es un proyecto de código abierto que se utiliza para generar documentos API REST para servicios web RESTful . Proporciona una interfaz de usuario para acceder a nuestros servicios web RESTful a través del navegador web.


##### Mockito

Es una librería Java que permite simular el comportamiento de una clase de forma dinámica. De esta forma nos aislamos de las dependencias con otras clases y sólo testeamos la funcionalidad concreta que queremos.



## Instalación

Primero, se tendra que clonar el codigo fuente del microservicio.
```
$ git clone https://github.com/jcastillo20/Microservicio.git
```

Esto crea un directorio llamado Microservicio, inicializa un directorio .git en su interior, descarga toda la información de ese repositorio y saca una copia de trabajo de la última versión.

Una vez terminado de clonar, lo abrimos a traves del IDE  SpringToolSuite la carpeta cliente-service.

![image](https://user-images.githubusercontent.com/25796357/178638026-6458f631-4b94-4aa4-ae4e-0e2a457a7403.png)

Al proyecto general, le damos clic derecho para poder iniciarlo a travez de Spring Boot App, el servicio se levantara en el puerto 8080.

![image](https://user-images.githubusercontent.com/25796357/178638404-2b3ed4d0-484e-46b3-9799-0dc878bbb21b.png)


## Funcionamiento de Servicio

Para poder realizar las pruebas de funcionamiento de los microservicios desarrollados, utilizaremos la herramienta Postman e importaremos la collection descargada en la carpeta Postman Collection.

![image](https://user-images.githubusercontent.com/25796357/178638961-95072e22-6b50-4f30-8e41-b488deeb21d5.png)


Desde los siguientes servicios Rest, se podra realizar las pruebas de microservicios.
