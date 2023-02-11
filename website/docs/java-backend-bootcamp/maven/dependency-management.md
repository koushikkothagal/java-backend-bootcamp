# Dependency Management

One of the most powerful features of Maven is its ability to manage dependencies. Maven uses a central repository to store libraries and their dependencies, and allows developers to specify the dependencies that their project requires. Maven will then automatically download and manage these dependencies.

To specify a dependency in a Maven project, developers need to add the dependency information to the POM file. This includes information about the groupId, artifactId, and version of the dependency.

Here's an example of specifying a dependency in the POM file:

```xml
<dependency>
  <groupId>com.fasterxml.jackson.core</groupId>
  <artifactId>jackson-databind</artifactId>
  <version>2.11.3</version>
</dependency>
```

Maven uses a process called _dependency resolution_ to determine which versions of the dependencies to use. When a project specifies a dependency, Maven will first look in the local repository to see if the dependency is already present. If the dependency is not present in the local repository, Maven will download the dependency from the remote repository.

Maven also supports the use of version ranges for dependencies. This is useful when a project depends on a library that is frequently updated. Instead of specifying a specific version of a library, developers can specify a version range.

Here's an example of specifying a version range for a dependency:

```xml
<dependency>
  <groupId>com.fasterxml.jackson.core</groupId>
  <artifactId>jackson-databind</artifactId>
  <version>[2.11.0,2.12.0)</version>
</dependency>
```

In this example, we are specifying that the project depends on version 2.11.0 or later, but less than 2.12.0 of the jackson-databind library.

### Example ranges


| Range     | Meaning                                          |
| --------- | ------------------------------------------------ |
| (,1.0]    | x <= 1.0                                         |
| 1.0       | 1.0 (or a later version if 1.0 is not available) |
| [1.0]     | Exactly 1.0                                      |
| [1.2,1.3] | 1.2 <= x <= 1.3                                  |
| [1.0,2.0) | 1.0 <= x < 2.0                                   |
| [1.5,)    | x >= 1.5                                         |


When Maven resolves dependencies, it also considers the dependencies of the dependencies, these are known as transitive dependencies. Transitive dependencies are dependencies that are required by other dependencies in the project.

For example, if project A depends on library B, and library B depends on library C, then project A also depends on library C.

Maven will automatically download and manage transitive dependencies. However, this can lead to problems if a transitive dependency has a different version than the one that the project explicitly depends on. 

:::note
Maven uses a technique known as _dependency mediation_ to figure out which version to use to resolve such conflicts. The way it works is by pulling the dependency that is closest to the project in the dependency tree (fewest transitive hops)
:::

To avoid these issues, Maven provides several ways to manage transitive dependencies, such as excluding transitive dependencies and using dependency management.

To exclude a transitive dependency, developers can use the `<exclusions>` element in the POM file.

Here's an example of excluding a transitive dependency:

```xml
<dependency>
  <groupId>com.fasterxml.jackson.core</groupId>
  <artifactId>jackson-databind</artifactId>
  <version>2.11.3</version>
  <exclusions>
    <exclusion>
      <groupId>com.fasterxml.jackson.core</groupId>
      <artifactId>jackson-annotations</artifactId>
    </exclusion>
  </exclusions>
</dependency>
```

In this example, we are excluding the transitive dependency on the `jackson-annotations` library, which is a dependency of the `jackson-databind` library.

Another way to manage transitive dependencies is by using dependency management. Dependency management allows developers to specify the versions of dependencies that are used by the project's transitive dependencies. This can be done by specifying the dependencies in the `<dependencyManagement>` section of the POM file.

Here's an example of using dependency management:

```xml
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.fasterxml.jackson.core</groupId>
      <artifactId>jackson-annotations</artifactId>
      <version>2.11.3</version>
    </dependency>
  </dependencies>
</dependencyManagement>
```

In this example, we are specifying that the version of the jackson-annotations library that should be used by transitive dependencies is 2.11.3.


## Dependency scopes

Maven dependency scopes are used to define the level of visibility and accessibility of a dependency in a project. Maven has five built-in dependency scopes:

`compile`: This is the default scope. Dependencies with this scope are available during the entire build process, including compilation, testing, and runtime. These dependencies are also transitive, meaning that they are passed down to dependent projects.

`provided`: Dependencies with this scope are required for compilation and testing, but are not included in the final artifact. This scope is typically used for dependencies that are provided by the target environment, such as a servlet container or the JDK.

`runtime`: Dependencies with this scope are not required for compilation, but are needed at runtime. These dependencies are not transitive.

`test`: Dependencies with this scope are only available during the testing phase of the build process. These dependencies are not included in the final artifact.

`system`: Dependencies with this scope are not available in any remote repository. Developers must specify the path to the local file system for these dependencies. This scope is rarely used.

Dependency scope is defined in the POM file under the `<dependency>` element, and can be specified using the scope attribute. For example:

```xml
<dependency>
  <groupId>com.example</groupId>
  <artifactId>example-library</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

## Scope use cases

`compile`: This is the default scope and is used in most cases. A common use case for this scope is when a project uses a library that is required for both compilation and runtime. For example, including the Hibernate ORM library as a compile scope dependency to access the database in a project.

`provided`: This scope is used when a dependency is required during the build process but is already provided by the runtime environment. A common use case for this scope is when a project uses a servlet container such as Apache Tomcat or Jetty, and the servlet API is included as a provided scope dependency.

`runtime`: This scope is used when a dependency is required at runtime but not during the compilation process. A common use case for this scope is when a project uses a logging library such as Log4j or SLF4j, and the library is included as a runtime scope dependency.

`test`: This scope is used when a dependency is only required for testing purposes. A common use case for this scope is when a project uses a testing library such as JUnit or TestNG, and the library is included as a test scope dependency.

`system`: This scope is used when a dependency is not available in any remote repository and must be provided by the developer. A common use case for this scope is when a project uses a proprietary library that is not available in public repositories and must be provided by the developer.

:::note
When you use the provided and system scopes, you should be careful to ensure that the required dependency is available in the target environment, whether it is provided by the runtime environment or provided by the developer.
:::
