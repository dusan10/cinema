package cinema.service;


import cinema.dto.Hall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CinemaController {

    @Autowired
    private TransferDtoToEnteties tdte;

    @RequestMapping(value = "/hall", method = RequestMethod.GET)
    public ResponseEntity<Hall> get() {
        Hall hall = new Hall(1,"Vuk Karadzic", 150);
        return new ResponseEntity<>(hall, HttpStatus.OK);
    }

    @RequestMapping(value = "/hall", method = RequestMethod.POST)
    public ResponseEntity <List<Hall>> update(@RequestBody List<Hall> halls) {
      if (!(halls == null) && !halls.isEmpty()){
          halls.forEach(c -> tdte.update(c));
      }
      return  null;
    }
}
