# Gradle Web Integration Test Example Project

This application focuses on the narrow task of splitting an integration runtime in Jetty for the simplest application which implements the Gradle War plugin.

# motivation

The simple REST service framework is included so that one can introspect the various runtime and test environments.

# usage

* `git clone https://github.com/Dispader/gradle-war-integration-test-example.git`
* `./gradlew eclipse` - Generates all Eclipse files.
* `./gradlew jettyRun` - Assembles the webapp and deploys it to Jetty.
* `./gradlew test` - Runs the unit tests.
* `./gradlew integrationTest` - Deploys the application to Jetty, and runs the integration tests.

# known issues

* on failed integration test runs, the Jetty server fails to halt, and must be killed manually

[![Analytics](https://ga-beacon.appspot.com/UA-61184208-1/chromeskel_a/readme)](https://github.com/igrigorik/ga-beacon)
