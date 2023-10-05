package org.bedu.javase2.ejemplo.ejemplo1.Example02.persistence;

import org.bedu.javase2.ejemplo.ejemplo1.Example02.models.Game;
import org.bedu.javase2.ejemplo.ejemplo1.Example02.models.Team;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ComponentScan(basePackages = "org.bedu.javase2.ejemplo.ejemplo1")
@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GameRepositoryTest {
    @Autowired
    private GameRepository partidoRepository;

    @Autowired
    private TeamRepository equipoRepository;

    Team equipo1;
    Team equipo2;

    @BeforeAll
    void setupDatabase() {
        partidoRepository.deleteAll();
        equipoRepository.deleteAll();

        equipo1 = new Team();
        equipo1.setName("Equipo Bedu");
        equipoRepository.save(equipo1);

        equipo2 = new Team();
        equipo2.setName("Equipo Beto");
        equipoRepository.save(equipo2);
    }

    @Test
    @DisplayName("Busca por nombres")
    void searchMatchByNames() {

        Game partido = new Game();
        partido.setEquipo1(equipo1);
        partido.setEquipo2(equipo2);
        partido.setMarcadorEquipo1(0);
        partido.setMarcadorEquipo2(0);

        partidoRepository.save(partido);

        Iterable<Game> conjuntoPartidos = partidoRepository.findAllByEquipo1NombreAndEquipo2Nombre("Equipo X", "Equipo Y");

    }
}
