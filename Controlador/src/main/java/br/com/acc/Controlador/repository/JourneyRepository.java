package br.com.acc.Controlador.repository;

import br.com.acc.Controlador.model.WorkJourney;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JourneyRepository extends JpaRepository<WorkJourney,Long> {
}
