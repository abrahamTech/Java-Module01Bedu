## Build a project an execute it

1.- Create an file called `build.gradle`

2.- Click in the part that say `Load Gradle Project`

3.- Write the next code 
```bash
task hello {
    doLast {
        println "Hello World!!!"
    }
}
```

4.- Ctrl + Shift + B