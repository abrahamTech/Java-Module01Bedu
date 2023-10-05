package org.bedu.javase2.ejemplo.ejemplo1.Example02.persistence;

import org.bedu.javase2.ejemplo.ejemplo1.Example02.models.Game;
import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Game, Long> {
    Iterable<Game> findAllByEquipo1NombreAndEquipo2Nombre(String nombreEquipo1, String nombreEquipo2);
}
