package org.abrahamtech.session02.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

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

    @Test
    @DisplayName("Repository should find an interviewer")
    public void findInterviewer() {
        //Arrange: Debe existir al menos un elemento en el repositorio
        String name = "John Smith";
        String email = "john@gmail.com";

        repository.save(name, email);

        //Act:
        Optional<Interviewer> result = repository.findEmail(email);
        Interviewer interviewer = result.get();

        //Assert:
        assertTrue(result.isPresent());
        assertNotNull(interviewer);
        assertEquals(name, interviewer.getName());

    }

    @Test
    @DisplayName("Repository shouldn't find an interviewer")
    public void dontFindInterviewer() {
        //Arrange: No debe de existir el correo que se busca en el repositorio
        String email2 = "user@gmail.com";

        // repository.save(name, email);

        //Act:
        Optional<Interviewer> result = repository.findEmail(email2);

        //Assert:
        assertTrue(result.isEmpty());

    }
}
