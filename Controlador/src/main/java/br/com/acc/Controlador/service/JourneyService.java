package br.com.acc.Controlador.service;

import br.com.acc.Controlador.model.WorkJouney;
import br.com.acc.Controlador.repository.JourneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JourneyService {


    JourneyRepository journeyRepository;

    @Autowired
    public JourneyService(JourneyRepository journeyRepository) {
        this.journeyRepository = journeyRepository;
    }

    public WorkJouney saveJourney(WorkJouney workJouney){
        return journeyRepository.save(workJouney);

    }

    public List<WorkJouney> findAll() {
      return journeyRepository.findAll();
    }

    public Optional<WorkJouney> getByID(Long idJourneys) throws Exception {
        return journeyRepository.findById(idJourneys);
    }

    public WorkJouney updateJourney(WorkJouney workJouney){
        return journeyRepository.save(workJouney);
    }

    public void  deleteJourney(Long idJourneys){
        journeyRepository.deleteById(idJourneys);
    }
}
