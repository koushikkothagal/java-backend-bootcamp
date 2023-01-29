# Project Object Model (POM)

The Project Object Model (POM) is the core of any project build with Maven, and it is the single source of truth for all aspects of the project build process.

The POM file is an XML file that contains all the information about a Maven project. It is the central piece of configuration in a Maven project and is used by Maven to build and manage the project. The POM file is typically named "pom.xml" and is located in the root directory of the project.

The minimum requirement for a POM are the following:

- `project` root
- `modelVersion` - should be set to 4.0.0
- `groupId` - the id of the project's group.
- `artifactId` - the id of the artifact (project)
- `version` - the version of the artifact under the specified group

However a typical POM file contains several sections, each with a specific purpose. The basic structure of a POM file looks like this:

```xml
<project>
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>myproject</artifactId>
    <version>1.0-SNAPSHOT</version>
    <dependencies>
        ...
    </dependencies>
    <build>
        ...
    </build>
    <profiles>
        ...
    </profiles>
</project>
```

The `<modelVersion>` element specifies the version of the POM model that is being used. The current version of the POM model is 4.0.0.

## Project coordinates

Project coordinates are used to uniquely identify a project and its dependencies within a repository. Project coordinates consist of three parts: the `groupId`, `artifactId`, and `version`.

`groupId`: This is a unique identifier for a group of related projects. It is typically in the form of a reverse domain name, such as `com.example` or `org.myproject`.

`artifactId`: This is a unique identifier for a specific project within a group. It is typically a simple name that describes the project, such as `myproject` or `mylibrary`.

`version`: This is the version of the project. This can be a specific version number, such as `1.0`, or a version range, such as `[1.0,2.0)`.

Together, the `groupId`, `artifactId`, and `version` form a unique identifier for a project and its dependencies within a repository. This allows Maven to manage dependencies and resolve conflicts between different versions of libraries.

When a developer specifies a dependency in the POM file, they need to provide the project coordinates of the dependency. Maven will then use these coordinates to download the dependency from the repository and include it in the project's classpath.

For example, if a developer wants to include the Apache Log4j library as a dependency in their project, they would specify the following coordinates in the POM file:

```xml
<dependency>
<groupId>log4j</groupId>
<artifactId>log4j</artifactId>
<version>1.2.17</version>
</dependency>
```

In this example, the groupId is `log4j`, the artifactId is `log4j`, and the version is `1.2.17`.

By using project coordinates, Maven can ensure that the correct version of a library is used and that there are no conflicts between different versions. This helps to ensure that the project is stable and that it can be easily maintained.

## Dependencies section

The `<dependencies>` element is used to specify the dependencies for the project. Each dependency is specified as a `<dependency>` element, which contains information about the groupId, artifactId, and version of the dependency.

Here's an example of specifying a dependency in the POM file:

```xml
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.11.3</version>
</dependency>
```

In this example, we are adding a dependency on the `jackson-databind` library, which is a popular library for serializing and deserializing JSON in Java.

## Build section

The build section in the POM file in Maven is used to configure the build process for a project. It contains information about how the project should be built, including details such as the build plugins, the build order, and the build output directory.

The build section in the POM file typically includes the following elements:

`<plugins>`: which is used to configure the build plugins that are used by Maven to build the project. This section lists the plugins that are used for tasks such as compilation, testing, and packaging.

`<pluginsManagement>`: This section is used to manage the versions of plugins that are used by the project. It allows you to specify a version of a plugin that should be used for all projects in an organization, rather than specifying it in each project's POM file.

`<resources>`: This section is used to configure the resources that are included in the project's build output. Resources are typically files such as properties files, XML files, and other non-Java files that are required by the project.

`<testResources>`: This section is used to configure the resources that are included in the project's test build output. These resources are typically files such as properties files, XML files, and other non-Java files that are required by the project tests.

`<directory>`: This element specifies the directory where the built files will be placed.

`<finalName>`: This element specify the final name of the built artifact, such as the name of the JAR or WAR file.

The build section can also include other elements, such as `<filters>` and `<sourceDirectory>` that are used to configure the build process for the project. The build section is an important part of the POM file, as it allows you to configure the build process for your project in a central location, making it easy to maintain and change the build configuration as needed.

## Profiles section

The `profiles` section is used to configure and manage different build settings or environments for the project. This allows the user to easily switch between different configurations without having to manually update the POM file each time. For example, a user could have a `development` profile and a `production` profile, each with different settings for dependencies, plugins, or properties. Profiles can be activated through command line options, environment variables, or settings files. Once activated, the settings in the profile will override any settings in the POM file that are not defined in the profile.

The `<profiles>` element is used to specify different build settings for different environments. A profile is a set of configuration settings that can be activated using the -P command line option.

## Using properties

In addition, Maven supports the use of properties, which can be used to specify values that can be used throughout the POM file. Properties are specified using the `<properties>` element and can be accessed using the `${property}` syntax.

Here's an example of using a property in the POM file:

```xml
<properties>
<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
</properties>
...
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.8.0</version>
            <configuration>
                <encoding>${project.build.sourceEncoding}</encoding>
            </configuration>
        </plugin>
    </plugins>
</build>
```

In this example, we have defined a property named `project.build.sourceEncoding` and set its value to `UTF-8`. We then use this property in the configuration for the `maven-compiler-plugin` to specify the encoding for the source code.

## Implicit properties

Maven has a set of implicit properties that can be accessed and used in various parts of a project's POM file. These properties provide information about the project and the environment in which it is built.

Some examples of implicit properties include:

- `project.basedir`: The base directory of the project.
- `project.version`: The version of the project.
- `project.groupId`: The groupId of the project.
- `project.artifactId`: The artifactId of the project.
- `project.build.directory`: The directory where the project is built.
- `project.build.outputDirectory`: The directory where compiled classes are stored.
- `project.build.sourceDirectory`: The directory where the project's source code is stored.
- `project.build.testSourceDirectory`: The directory where the project's test source code is stored.
- ..and more

Refer: https://github.com/cko/predefined_maven_properties/blob/master/README.md

These properties can be accessed and used in the POM file by enclosing them in `${}` brackets. For example, to specify the output directory for the compiled classes, the `project.build.outputDirectory` property can be used like this:

```xml
<build>
    <outputDirectory>${project.build.outputDirectory}</outputDirectory>
</build>
```
