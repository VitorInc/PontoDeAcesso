package br.com.acc.Controlador.controller;

import br.com.acc.Controlador.model.WorkJourney;
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

    @PostMapping
    public WorkJourney createJourney(@RequestBody WorkJourney workJourney){
        return journeyService.saveJourney(workJourney);
    }

    @GetMapping
    public List<WorkJourney> getJourneyList(){
        return journeyService.findAll();
    }

    @GetMapping("/{idJourney}")
    public ResponseEntity<WorkJourney> getJourneyListID(@PathVariable("idJourney") Long idJourneys) throws Exception {
        return ResponseEntity.ok(journeyService.getByID(idJourneys).orElseThrow(() -> new Exception("Journey not founded")));
    }

    @PutMapping
    public WorkJourney updateJourney(@RequestBody WorkJourney workJourney){
        return journeyService.updateJourney(workJourney);
    }
    @DeleteMapping("/{idJourneys}")
    public ResponseEntity deleteById(@PathVariable("idJourneys") Long idJourneys) throws Exception{
        try{
            journeyService.deleteJourney(idJourneys);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<WorkJourney>) ResponseEntity.ok();
    }

}
