package org.abraham.java.backend.Session08.persistence;

import org.abraham.java.backend.Session08.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
