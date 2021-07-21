package br.com.acc.Controlador.service;

import br.com.acc.Controlador.model.WorkJouney;
import br.com.acc.Controlador.repository.JourneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
