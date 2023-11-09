# Introduction Spring

## Spring Initializer

`https://start.spring.io/`

## Getting Started
First exceute the next command in the terminal

Windows
```bash
./gradlew.bat bootRun
```

Linux/Mac
```bash
./gradlew bootRun
```

## Fix Scanner Run

Add the next line of code in `build.gradle` file to run the code with the `@Override` of the Application

```bash
bootRun {
    standardInput = System.in
}
```
