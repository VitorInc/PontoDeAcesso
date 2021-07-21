package br.com.acc.Controlador.controller;

import br.com.acc.Controlador.model.WorkJouney;
import br.com.acc.Controlador.repository.JourneyRepository;
import br.com.acc.Controlador.service.JourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/acesso")
public class AccessController {

    @Autowired
    JourneyService journeyService;

    @PostMapping(value = "1")
    public WorkJouney createJourney(@RequestBody WorkJouney workJouney){
        return journeyService.saveJourney(workJouney);
    }

}
