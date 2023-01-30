# Plugins

## What are Maven plugins?

One of the key features of Maven is its ability to use plugins to perform various tasks. A plugin is a set of goals that are executed during the build lifecycle. Maven provides a wide range of plugins that can be used to perform tasks such as compiling, testing, and packaging.

The most commonly used plugins in Maven are explained below.

### maven-compiler-plugin
This plugin is used to compile the source code of the project. It can be configured to use a specific version of the Java compiler and specify the source and target versions of the code.

Here's an example of how to use the maven-compiler-plugin in the POM file:

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.8.0</version>
            <configuration>
                <source>1.8</source>
                <target>1.8</target>
            </configuration>
        </plugin>
    </plugins>
</build>
```

In this example, we are specifying that the source and target version of the code should be 1.8.

### maven-surefire-plugin
This plugin is used to run the tests for the project. It can be configured to specify the test source directory, test class name pattern, and other test-related settings.

Here's an example of how to use the maven-surefire-plugin in the POM file

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>3.0.0-M4</version>
            <configuration>
                <skipTests>false</skipTests>
                <testSourceDirectory>src/test/java</testSourceDirectory>
                <includes>
                    <include>\**/*Test.java</include>
                </includes>
            </configuration>
        </plugin>
    </plugins>
</build>
```

In this example, we are specifying that the test source directory is `src/test/java` and that we want to run all the test cases that have names ending with `Test`.

### maven-jar-plugin
This plugin is used to package the compiled code into a JAR file. It can be configured to specify the final name of the JAR file, the location of the compiled classes, and other packaging-related settings.

Here's an example of how to use the maven-jar-plugin in the POM file:

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-jar-plugin</artifactId>
            <version>3.2.0</version>
            <configuration>
                <finalName>myproject</finalName>
                <outputDirectory>${project.build.directory}/classes</outputDirectory>
            </configuration>
        </plugin>
    </plugins>
</build>
```

In this example, we are specifying that the final name of the JAR file should be `myproject` and that the output directory for the compiled classes should be `${project.build.directory}/classes`.

Other popular plugins include the maven-war-plugin for packaging web applications, the maven-dependency-plugin for managing dependencies, and the maven-resources-plugin for managing project resources.

:::note
Maven also allows developers to create their own custom plugins. This can be useful for tasks that are specific to a particular project or organization.
:::


## Dependencies vs plugins

Maven dependencies are libraries that a Maven project depends on to function correctly. Maven plugins, on the other hand, are specialized tools that can be used to perform specific tasks as part of a Maven build. As we've seen, these tasks can include compiling code, running tests, packaging the project, and more. Like dependencies, plugins are also specified in the pom.xml file and are automatically downloaded and managed by Maven. Unlike dependencies, which are typically used at runtime, plugins are used during the build process.

In summary, dependencies are libraries that a project uses to function, while plugins are specialized tools used to perform specific tasks during the build process.
