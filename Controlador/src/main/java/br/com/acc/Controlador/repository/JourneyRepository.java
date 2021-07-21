package br.com.acc.Controlador.repository;

import br.com.acc.Controlador.model.WorkJouney;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JourneyRepository extends JpaRepository<WorkJouney,Long> {
}
