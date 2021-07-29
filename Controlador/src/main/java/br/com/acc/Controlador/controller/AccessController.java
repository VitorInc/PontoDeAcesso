package br.com.acc.Controlador.controller;

import br.com.acc.Controlador.model.WorkJouney;
import br.com.acc.Controlador.repository.JourneyRepository;
import br.com.acc.Controlador.service.JourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/acesso")
public class AccessController {

    @Autowired
    JourneyService journeyService;

    @PostMapping(value = "1")
    public WorkJouney createJourney(@RequestBody WorkJouney workJouney){
        return journeyService.saveJourney(workJouney);
    }

    @GetMapping
    public List<WorkJouney> getJourneyList(){
        return journeyService.findAll();
    }

    @GetMapping("/{idJourney}")
    public ResponseEntity<WorkJouney> getJourneyListID(@PathVariable("idJourney") Long idJourneys) throws Exception {
        return ResponseEntity.ok(journeyService.getByID(idJourneys).orElseThrow(() -> new Exception("Journey not founded")));
    }

}
