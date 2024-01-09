package org.abrahamtech.session02.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.abrahamtech.session02.model.Interviewer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InterviewerRepositoryTest {

    private static InterviewerRepository repository;

    //Codigo que se ejecuta antes de inciar todas las pruebas
    //Para no repetir el codigo del Arrange
    @BeforeAll
    public static void setup() {
        //Arrange: Que exista una instancia del repositorio
        repository = new InterviewerRepository();
    }

    //Codigo que se ejecuta despues de cada una de las pruebas
    @AfterEach
    public void after() {
        // Limpiar el repositorio
        repository.clear();
    }
    
    @Test
    @DisplayName("A new repository should be empty")
    public void emptyCase() {
        //Arrange: Que exista una instancia del repositorio
        // InterviewerRepository repository = new InterviewerRepository();

        //Act: El código a probar
        int count = repository.count();

        //Assert: Comprobar el resultado esperado
        //La variable count deberia ser 0
        assertEquals(0, count);
    }

    @Test
    @DisplayName("Repository should save an interviewer")
    public void saveCase() {
        //Arrange
        // InterviewerRepository repository = new InterviewerRepository();

        String name = "John Smith";
        String email = "john@gmail.com";

        //Act:
        Interviewer interviewer = repository.save(name, email);

        //Assert:
        assertEquals(1, interviewer.getId());
        assertEquals(1, repository.count());
        assertEquals(name, interviewer.getName());
        assertEquals(email, interviewer.getEmail());
    }
}
