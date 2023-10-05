package org.bedu.javase2.ejemplo.ejemplo1.Example02.persistence;

import org.bedu.javase2.ejemplo.ejemplo1.Example02.models.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long> {
}
