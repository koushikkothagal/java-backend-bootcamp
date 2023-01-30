# Profiles

## What are profiles?

Maven profiles are a way to configure build settings for different environments. A profile is a set of configuration settings that can be activated by specifying the profile in the command line or in the POM file. Profiles can be used to configure settings such as the version of the Java compiler, the location of the local repository, and the active plugins.

To create a profile in a Maven project, developers need to add the profile information to the POM file. This can be done in the `<profiles>` section of the POM file.

Here's an example of creating a profile in the POM file:

```xml
<profiles>
    <profile>
    <id>dev</id>
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
    </profile>
</profiles>
```

In this example, we are creating a profile with the id "dev" and specifying a configuration for the maven-compiler-plugin.

To activate a profile, developers can specify the profile in the command line by using the -P option.

Here's an example of activating a profile in the command line:

```sh
mvn clean install -Pdev
```

In this example, we are activating the "dev" profile.

It's also possible to activate a profile by specifying it in the POM file, in the `<activeProfiles>` section.

Here's an example of activating a profile in the POM file:

```xml
<activeProfiles>
    <activeProfile>dev</activeProfile>
</activeProfiles>
```

In this example, we are activating the "dev" profile.

Profiles can also be used to configure different settings for different environments, such as setting a different local repository for a specific environment.

Here's an example of configuring a different local repository for a specific environment:

```xml
<profiles>
    <profile>
    <id>prod</id>
    <repositories>
        <repository>
            <id>prod-repo</id>
            <url>http://prod-repo.com/maven</url>
        </repository>
    </repositories>
    </profile>
</profiles>
```

In this example, we are creating a profile with the id "prod" and specifying a different remote repository for this profile.


Profiles specified in the POM can modify the following POM elements:

- `<repositories>`
- `<pluginRepositories>`
- `<dependencies>`
- `<plugins>`
- and more!

## Profile levels

Profiles can be defined in 3 levels:

- Per Project: Defined in the POM itself (pom.xml).
- Per User: Defined in the Maven-settings (%USER_HOME%/.m2/settings.xml).
- Global: Defined in the global Maven-settings (${maven.home}/conf/settings.xml).

In conclusion, Maven profiles are a powerful feature that allows developers to configure build settings for different environments. They can be used to specify different configurations for plugins, dependencies, repositories, and other settings. Profiles can be activated by specifying the profile in the command line or in the POM file. This allows developers to easily switch between different configurations for different environments, such as development, testing, and production. This can greatly streamline the development process and reduce the risk of errors caused by environment-specific configurations. Understanding how to use profiles in Maven is an essential skill for effectively managing Maven projects.
