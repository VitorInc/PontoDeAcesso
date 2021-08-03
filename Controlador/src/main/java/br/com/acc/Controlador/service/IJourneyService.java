package br.com.acc.Controlador.service;

import br.com.acc.Controlador.model.WorkJourney;

import java.util.List;
import java.util.Optional;

public interface IJourneyService {
    public WorkJourney saveJourney(WorkJourney workJourney);
    public List<WorkJourney> findAll();
    public Optional<WorkJourney> getByID(Long idJourneys) throws Exception;
    public WorkJourney updateJourney(WorkJourney workJourney);
    public void  deleteJourney(Long idJourneys);

}
