💬 Challenge ForoHub
✨ Bienvenido(a) al reto ForoHub

Este proyecto forma parte del programa Alura Latam, desarrollado por Hilker Cifuentes.
El desafío consiste en construir una API REST con Spring Boot para gestionar un foro, donde las personas usuarias puedan:

Crear nuevos tópicos (preguntas, dudas, sugerencias).

Listar todos los tópicos existentes.

Actualizar y eliminar tópicos.

Interactuar mediante una base de datos persistente.

🚀 Funcionalidades principales

📋 Listar tópicos con método GET /topicos.

➕ Crear un tópico con método POST /topicos.

✏️ Actualizar un tópico con método PUT /topicos/{id}.

❌ Eliminar un tópico con método DELETE /topicos/{id}.

🔐 Autenticación con JWT: solo las personas registradas pueden crear, editar o eliminar tópicos.

⚙️ Flujo de uso con Insomnia / Postman

Listar tópicos existentes:

Ruta: GET http://localhost:8080/topicos

Retorna todos los tópicos en la base de datos.

Crear un nuevo tópico:

Ruta: POST http://localhost:8080/topicos

Requiere autenticación con Bearer Token (JWT).

Ejemplo de cuerpo JSON:

{
  "titulo": "Error al conectar con MySQL",
  "mensaje": "Estoy teniendo problemas con la configuración de Hibernate",
  "autorId": 1,
  "curso": "Spring Boot"
}


Retorna 201 Created si se creó correctamente.

Autenticación:

Ruta: POST http://localhost:8080/auth

Enviar email y contraseña de un usuario ya registrado.

Devuelve un token JWT que se usará para las demás peticiones.

Actualizar o eliminar un tópico:

Se requiere pasar el token en la cabecera (Authorization: Bearer <token>).

Retorna 200 OK en operaciones exitosas.

🗂 Estructura del proyecto
src/main/java
 └── com.alura.forohub
     ├── controller   # Controladores REST (endpoints)
     ├── model        # Entidades de dominio (Usuario, Tópico, Curso)
     ├── repository   # Interfaces de acceso a la BD (Spring Data JPA)
     ├── service      # Lógica de negocio
     └── security     # Configuración JWT y seguridad con Spring Security
src/main/resources    # Archivos de configuración (application.properties)
pom.xml               # Dependencias y configuración de Maven

🛠 Tecnologías utilizadas

☕ Java 17

🌱 Spring Boot 3.x

🔐 Spring Security + JWT

🗄 MySQL

🛠 Maven

🧪 Insomnia/Postman para pruebas

▶️ Ejecución

Clona el repositorio:

git clone https://github.com/tu-usuario/forohub.git


Configura la base de datos en application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/forohub
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña


Ejecuta la aplicación:

mvn spring-boot:run


Prueba los endpoints con Insomnia o Postman.

📌 Notas

Solo los usuarios autenticados pueden crear, actualizar o eliminar tópicos.

Los tokens JWT se deben incluir en el header de cada petición protegida.

Las respuestas usan los códigos de estado HTTP adecuados (200 OK, 201 Created, 403 Forbidden, etc.).