package br.com.acc.Controlador.service;

import br.com.acc.Controlador.model.WorkJourney;
import br.com.acc.Controlador.repository.JourneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JourneyService implements IJourneyService {


    JourneyRepository journeyRepository;

    @Autowired
    public JourneyService(JourneyRepository journeyRepository) {
        this.journeyRepository = journeyRepository;
    }

    public WorkJourney saveJourney(WorkJourney workJourney){
        return journeyRepository.save(workJourney);

    }

    public List<WorkJourney> findAll() {
      return journeyRepository.findAll();
    }

    public Optional<WorkJourney> getByID(Long idJourneys) throws Exception {
        return journeyRepository.findById(idJourneys);
    }

    public WorkJourney updateJourney(WorkJourney workJourney){
        return journeyRepository.save(workJourney);
    }

    public void  deleteJourney(Long idJourneys){
        journeyRepository.deleteById(idJourneys);
    }
}
