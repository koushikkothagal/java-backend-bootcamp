# Goals in Maven

## What are Maven goals?

In Maven, goals represent specific actions that can be performed on a project. Goals are associated with a plugin and simply Java methods in a class called Mojo (Maven plain Old Java Object). Each Mojo class has a single execute method and represents one goal.

A goal can be invoked from the command line by typing `mvn <plugin-name>:<goal-name>`.

For example, the `compile` goal is associated with the `maven-compiler-plugin`, and it can be invoked by typing `mvn compiler:compile`. This command will execute the compile goal which will compile the source code of the project.

Plugins in Maven are used to provide additional functionality to Maven to assist the development, build or release of a project. Each plugin is associated with one or more goals, which can be executed to perform specific actions. When a goal is executed, the plugin's Mojo is responsible for performing the necessary actions to accomplish the goal.

The convention of the goal name is `<plugin-name>:<goal-name>` as I mentioned before, the plugin name is followed by a colon `:` and then the goal name. This convention makes it easy to identify which plugin is associated with a goal and makes it easy to invoke the goal from the command line.

:::note
Some plugins can have multiple goals, such as the `maven-compiler-plugin`, it has the `compile` goal to compile the source code of a project, it also has the `testCompile` goal to compile the test source code of a project, and it also has the `help` goal to display the help for the plugin.
:::

Plugins provide additional functionality to a project and are associated with one or more goals which can be executed to perform specific actions.


## Why did `mvn compile` work?

A question that might be on your mind is: why does `mvn compile` work without the `compiler:` prefix?

It works because Maven tries to resolve the goal you invoke! When you type `mvn compile` on the command line, Maven will look for a goal named `compile` within the plugins that are defined in the project's POM file. If a plugin is found that defines a goal with that name, the goal will be executed.

And here, it finds the `maven-compiler-plugin` - a plugin that is commonly used in Java projects to compile the source code. It defines a goal named `compile`, which is used to compile the source code of a project.

How did the plugin get there? The `maven-compiler-plugin` is included in the maven-plugins group, which is one of the default groups of plugins that Maven makes available to all projects. This is why the compile goal is available by default.

Therefore, when you type mvn compile on the command line, there is no need to specify the plugin name compiler: before the goal name.

:::note
If multiple plugins provide the same goal name, Maven will execute the goal from the first plugin that it finds that defines that goal. The order in which plugins are defined in the POM file determines which plugin will be used when a goal with the same name is provided by multiple plugins. It's not recommended to have multiple plugins providing the same goal name, because it can lead to confusion and unexpected behavior
:::
