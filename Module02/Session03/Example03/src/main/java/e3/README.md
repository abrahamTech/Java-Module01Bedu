# Test Suites
When we start to develop a number of tests, sometimes we want to group them in a logical way that makes sense and run them together and independently of the other tests we may have in the system. This logical grouping of tests is known as the Test Suite.

JUnit provides the following annotations for creating test suites:

`@Suite`: Indicates that the class in which the annotation is placed will serve as a "configuration" class for the test suite. Along with this annotation, one of the following must be placed.

`@SelectPackages`: Indicates in which package are the classes that we want to be executed as part of the test suite.

`@SelectClasses`: Indicates which classes will be executed as part of the test suite.


To define a test suite we must choose one of the last two annotations above and place it, with their respective values, in an empty class. This class doesn't need to have any code, as its only purpose is for us to have a place to put the annotation.

## Implementation
To include the test suites in the project we must add an additional dependency in the file `build.grade`:
```bash
dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.8.2' //We already had them
    testImplementation 'org.junit.jupiter:junit-jupiter-engine:5.8.2' //We already had them
    implementation 'org.junit.platform:junit-platform-suite-engine:1.8.2'
}

test {
    useJUnitPlatform()
}
```