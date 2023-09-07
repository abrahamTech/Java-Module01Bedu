# Mockito
Mockito is a framework that allows you to work in many ways, but the cleanest and easiest is to define and initialize mock objects using annotations. For which Mockito provides two basic annotations:

`@Mock`: Used to tell Mockito to create a test double of the object decorated with this annotation.

`@Spy`: Indicates that in addition to creating the test double, we will perform some validation or verification on the methods that were executed on this object. This is done to check that the flow that our test execution followed is indeed the one we are expecting.

`@InjectMocks`: Takes all the mock objects created and automatically injects them into the object we'll use to run the tests.

## Implementation

For this exercise we will modify the calculator that we used in the previous example to add a constant value which we will obtain from a database using a Data Access Object (DAO). Since we don't want to test the implementation of the component that is responsible for connecting to the database to get the value, but that the calculator works correctly using that value, we will mock the DAO object using a Mock object.

The first thing we need to do is include the JUnit and Mockito dependencies in our project. We do this by placing the following lines in the build.gradle file, which indicate that we should use the Junit jupiter dependency only in testing:

```bash
dependencies {
    implementation 'org.junit.jupiter:junit-jupiter:5.8.1'
    implementation 'org.mockito:mockito-junit-jupiter:4.3.1'
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.8.2' //We already had them
    testImplementation 'org.junit.jupiter:junit-jupiter-engine:5.8.2' //We already had them

    testImplementation 'org.mockito:mockito-junit-jupiter:4.3.1'
    testImplementation 'org.mockito:mockito-core:4.3.1'
}

test {
    useJUnitPlatform()
}
```