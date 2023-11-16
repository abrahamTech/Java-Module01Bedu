## Validation

For add validation in the params that write the user

### First
Add the next line in `build.gradle` file
```bash
implementation 'org.springframework.boot:spring-boot-starter-validation'
```

### Second
Add `@Valid` in the controller file, where you have the @RequestBody of the params request
```bash
public Todo create(@Valid @RequestBody Todo data) {
        data.setCompleted(false);
        data.setId(++currentId);

        todos.add(data);

        return data;
}
```

### Third
Finally Add to the Model in the params that you want to validate the type of validation that you want to implement
```bash
@NotNull
@Size(max = 100)
private String title;
@NotNull
@Size(max = 2500)
private String description;
```