# Gradle Web Integration Test Example Project

This application focuses on the narrow task of splitting an integration runtime in Jetty for the simplest application which implements the Gradle War plugin.

# motivation

The simple REST service framework is included so that one can introspect the various runtime and test environments.

# usage

* `git clone https://github.com/Dispader/gradle-war-integration-test-example.git`
* `./gradlew eclipse` - Generates all Eclipse files.
* `./gradlew jettyRun` - Assembles the webapp, using the integraiton test configuration, and deploys it to Jetty.
* `./gradlew test` - Runs the unit tests.
* `./gradlew integrationTest` - Deploys the application to Jetty, and runs the integration tests.
* `./gradlew jettyRunWar` - Assembles the webapp into a war and deploys it to Jetty.  (default configuration)

# use the plugin in your project

Add it to your project by including it in `./gradle/plugins/` or via URL:

```Gradle
apply from: 'https://raw.githubusercontent.com/Dispader/gradle-war-integration-test-example/master/gradle/plugins/integration-test.gradle'
```

place your tests and resources in the `src/integrationTests` tree, and declare dependencies in your build:

```Gradle
dependencies {
    integrationTestCompile 'org.spockframework:spock-core:1.0-groovy-2.3'
    integrationTestCompile 'org.codehaus.groovy.modules.http-builder:http-builder:0.7.1'
}
```

[![Analytics](https://ga-beacon.appspot.com/UA-61184208-1/chromeskel_a/readme)](https://github.com/igrigorik/ga-beacon)
