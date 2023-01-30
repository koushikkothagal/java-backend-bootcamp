# Repositories


# What are Maven repositories?

A key feature of Maven is its ability to manage dependencies through the use of repositories. Maven uses a central repository to store libraries and their dependencies, and allows developers to specify the dependencies that their project requires. Maven will then automatically download and manage these dependencies.

There are two types of repositories in Maven: remote and local.

A remote repository is a repository that is located on a remote server and is accessible over the network. This is the default repository used by Maven to download dependencies. The default remote repository for Maven is the Maven Central repository, which is hosted by the Apache Software Foundation and contains thousands of libraries.

A local repository is a repository that is located on the developer's local machine. This repository is used to store dependencies that have been downloaded from a remote repository. The local repository is usually located in the `.m2` directory in the user's home directory.

To specify a remote repository in a Maven project, developers can use the `<repositories>` element in the POM file.

Here's an example of specifying a remote repository in the POM file:

```xml
<repositories>
    <repository>
    <id>my-repo</id>
    <url>http://my-repo.com/maven</url>
    </repository>
</repositories>
```

In this example, we are specifying a remote repository with the id `my-repo` and the url `http://my-repo.com/maven`.

It's also possible to specify a local repository in the settings.xml file, which is located in the .m2 directory in the user's home directory.

Here's an example of specifying a local repository in the settings.xml file:

```xml
<localRepository>/path/to/local/repo</localRepository>
```

With this, Maven will pick up this path as the location of the local repository.

When Maven resolves dependencies, it first checks the local repository to see if the dependency is already present. If the dependency is not present in the local repository, Maven will download the dependency from the remote repository.

:::note
Artifacts labeled with a SNAPSHOT in their versions are the exception. Maven will look for an updated version of the dependency from remote repositories every day since the dependency is likely in active development.
:::

It's also worth noting that Maven allows developers to use multiple repositories. This can be useful when a project depends on a library that is not available in the default remote repository. In this case, developers can specify a custom remote repository in the POM file.

In summary, Maven uses repositories to manage dependencies. There are two types of repositories in Maven: remote and local. Remote repositories are located on remote servers and are accessible over the network, while local repositories are located on the developer's local machine. Developers can specify remote and local repositories in the POM file and the settings.xml file, respectively. Understanding how to use repositories to manage dependencies is essential for effectively managing Maven projects.
