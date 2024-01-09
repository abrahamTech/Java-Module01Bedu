package org.abrahamtech.session02.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InterviewerRepositoryTest {
    
    @Test
    @DisplayName("A new repository should be empty")
    public void emptyCase() {
        //Arrange: Que exista una instancia del repositorio
        InterviewerRepository repository = new InterviewerRepository();

        //Act: El código a probar
        int count = repository.count();

        //Assert: Comprobar el resultado esperado
        //La variable count deberia ser 0
        assertEquals(0, count);
    }
}
