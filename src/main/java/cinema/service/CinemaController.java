package cinema.service;


import cinema.db.entities.Hall;
import cinema.db.repos.HallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CinemaController {

    @Autowired
    private TransferDtoToEnteties tdte;

    @Autowired
    private HallRepository hallRepository;


    @GetMapping
    public Iterable findAll () {
        return hallRepository.findAll();
    }

    @GetMapping ("/hall/{hallName}")
    public List findHallByName (@PathVariable String hallName) {
        return hallRepository.finbByName(hallName);
    }

    @GetMapping("/{idHall}")
    public Hall findEmptyHall (@PathVariable String hallName, int capacity){
        return hallRepository.findEmpty(hallName, capacity);
    }

    @RequestMapping(value = "/hall", method = RequestMethod.GET)
    public ResponseEntity <Hall> get() {
      return null;
    }




}
