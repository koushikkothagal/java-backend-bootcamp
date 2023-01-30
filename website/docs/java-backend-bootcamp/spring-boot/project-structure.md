# Spring Boot project structure

One of the key features of Spring Boot is its ability to automatically configure and set up a project based on a set of conventions and best practices. This makes it easy to get started with a new project and ensures that the project is structured in a consistent and maintainable way. In this section, we will take a look at the basic project structure of a Spring Boot application, including the main class, the package structure, and the resources folder.

## Main Class

The _entry point_ of a Spring Boot application is a class that contains the `main()` method. This method is responsible for starting the Spring Boot application and is typically annotated with the `@SpringBootApplication` annotation. This annotation tells Spring Boot to scan the current package and all of its sub-packages for components, such as controllers and services, and to configure them automatically. The main class is also responsible for loading any additional configuration that is specified in application.properties or application.yml files.

Here is an example of a simple main class for a Spring Boot application:

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class, args);
    }

}
```

## App bootstrap

`SpringApplication.run(...)` is a static method that is used to launch a Spring Boot application. It takes in the primary source class of the application as an argument and creates and configures a `SpringApplication` object, which is then used to launch the application.

The `@SpringBootApplication` annotation is a convenience annotation that is equivalent to using `@Configuration`, `@EnableAutoConfiguration`, and `@ComponentScan` together. It is typically used on the main class of a Spring Boot application to enable and configure Spring Boot's auto-configuration feature and to enable component scanning for the application.

## Package Structure

The package structure of a Spring Boot application is typically organized based on the components that make up the application. The main class is typically located in the root package, along with any other configuration classes, such as application properties and security configuration. Controllers, services, and repositories are typically located in separate packages, with the package names indicating the role of the classes within the application.

Here is an example of a package structure for a Spring Boot application:

```
com.mycompany
|-- MySpringBootApplication.java
|-- config
|   |-- SecurityConfig.java
|   |-- ApplicationProperties.java
|-- controller
|   |-- UserController.java
|-- service
|   |-- UserService.java
|-- repository
|   |-- UserRepository.java
```

Another common approach is to group files by features, irrespective of whether they are controllers, services or data repositories.

```
com.mycompany
|-- MySpringBootApplication.java
|-- config
|   |-- SecurityConfig.java
|   |-- ApplicationProperties.java
|-- user
|   |-- UserController.java
|   |-- UserService.java
|   |-- UserRepository.java
|-- account
|   |-- AccountController.java
|   |-- AccountService.java
|-- repository
```

## Resources Folder

The resources folder is where Spring Boot looks for additional resources, such as application properties and static files. The resources folder is typically located in the root of the classpath and is named "resources" by default.

The application.properties or application.yml files are typically located in the root of the resources folder and are used to configure various aspects of the application, such as the database connection, security settings, and logging configuration.

Static files, such as HTML, CSS, and JavaScript files, are typically located in a subfolder of the resources folder, such as "static" or "public". These files are automatically served by Spring Boot when the application is running.

Here is an example of the resources folder structure of a Spring Boot application:

```
src/main/resources
|-- application.properties
|-- static
|   |-- css
|   |   |-- styles.css
|   |-- js
|   |   |-- script.js
|-- templates
|   |-- index.html
```
