# Play Framework with Scala.js, Binding.scala

[![Join the chat at https://gitter.im/Full-Stack-Scala-Starter/Lobby](https://badges.gitter.im/Full-Stack-Scala-Starter/Lobby.svg)](https://gitter.im/Full-Stack-Scala-Starter/Lobby?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

This is a simple example application showing how you can integrate a Play project with a Scala.js, Binding.scala project. 

Frontend communicates with backend via JSON. Project aims to be a simple modern starting point.

The application contains three directories:
* `server` Play application (server side)
* `client` Scala.js, Binding.scala application (client side)
* `shared` Scala code that you want to share between the server and the client

## Run the application
```shell
$ sbt
> run
$ open http://localhost:9000
```

## Features

The application uses the [sbt-web-scalajs](https://github.com/vmunier/sbt-web-scalajs) sbt plugin and the [scalajs-scripts](https://github.com/vmunier/scalajs-scripts) library.

- Run your application like a regular Play app
  - `compile` triggers the Scala.js fastOptJS command
  - `run` triggers the Scala.js fastOptJS command on page refresh
  - `~compile`, `~run`, continuous compilation is also available
- Compilation errors from the Scala.js projects are also displayed in the browser
- Production archives (e.g. using `stage`, `dist`) contain the optimised javascript
- Source maps
  - Open your browser dev tool to set breakpoints or to see the guilty line of code when an exception is thrown
  - Source Maps is _disabled in production_ by default to prevent your users from seeing the source files. But it can easily be enabled in production too by setting `emitSourceMaps in fullOptJS := true` in the Scala.js projects.


## IDE integration

### Eclipse

1. `$ sbt "eclipse with-source=true"`
2. Inside Eclipse, `File/Import/General/Existing project...`, choose the root folder. Uncheck the second and the last checkboxes to only import client, server and one shared, click `Finish`. ![Alt text](screenshots/eclipse-play-with-scalajs-example.png?raw=true "eclipse play-with-scalajs-example screenshot")

### IntelliJ

In IntelliJ, open Project wizard, select `Import Project`, choose the root folder and click `OK`.
Select `Import project from external model` option, choose `SBT project` and click `Next`. Select additional import options and click `Finish`.
Make sure you use the IntelliJ Scala Plugin v1.3.3 or higher. There are known issues with prior versions of the plugin.

Many thanks to [vmunier](https://github.com/vmunier/) for the initial starting point.
