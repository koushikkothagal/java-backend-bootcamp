# Build Lifecycle

## Overview

Maven uses a build lifecycle to manage the build process for a project. A build lifecycle is a series of phases that are executed in a specific order to build, test, and deploy a project. 

The default build lifecycle in Maven consists of the following phases:

`validate`: This phase validates that the project is correct and all necessary information is available.

`compile`: This phase compiles the source code of the project.

`test`: This phase runs the tests for the project.

`package`: This phase packages the compiled code into a JAR or WAR file.

`verify`: This phase runs additional checks on the package, such as integration tests.

`install`: This phase installs the package into the local repository for use as a dependency in other projects locally.

`deploy`: This phase copies the final package to the remote repository for sharing with other developers and projects.

Each phase in the build lifecycle can execute a set of plugins that are configured in the POM file. For example, the compile phase will execute the maven-compiler-plugin to compile the source code.

:::note
Some phases of the lifecycle can be skipped by passing the appropriate command line option. For example, to skip the tests, you can use the command `mvn install -DskipTests`.
:::

## Phases vs goals

Maven phases and goals are related but have different purposes.

As we've just seen, a Maven phase represents a stage in the build lifecycle, such as `compile`, `test`, or `package`. Phases are the high-level steps of the build process. Each phase, when executed, will execute a set of related goals.

Goals, on the other hand, represent specific tasks that need to be executed. Each goal is bound to one or more phases, and when a phase is executed, all of the goals bound to that phase will also be executed.

For example, the `compile` phase is responsible for compiling the source code, and it's bound to the `compiler:compile` goal, which is responsible for compiling the source code. So when we run the `compile` phase, the `compiler:compile` goal will be executed.

:::note
Maven provides several predefined goals that can be used to execute specific tasks. Just like the compile goal can be used to compile the source code, and the test goal can be used to run the tests. These goals can be executed by running the mvn command followed by the goal. For example, to run the tests, you can use the command `mvn test`.
:::

## Custom lifecycles

It's also possible to create custom lifecycles by creating a custom binding in the POM file. The custom binding can specify new actions to be performed during certain phases and plugins for a specific build.

Here's an example of a custom binding in the POM file:

```xml
<project>
  <build>
    <plugins>
      <plugin>
        <groupId>org.codehaus.mojo</groupId>
        <artifactId>build-helper-maven-plugin</artifactId>
        <version>3.3.0</version>
        <executions>
          <execution>
            <id>add-source</id>
            <phase>generate-sources</phase>
            <goals>
              <goal>add-source</goal>
            </goals>
            <configuration>
              <sources>
                <source>some directory</source>
                ...
              </sources>
            </configuration>
          </execution>
        </executions>
      </plugin>
    </plugins>
  </build>
</project>
```

In this example, we are using the build-helper-maven-plugin to add a new source directory to the project during the generate-sources phase.

:::note
The phases of the build lifecycle are executed in a specific order, and each phase is dependent on the previous phase. For example, the `package` phase is dependent on the `compile` and `test` phases being successful. This means that if the tests fail during the `test` phase, the `package` phase will not be executed, and the build will fail.
:::

