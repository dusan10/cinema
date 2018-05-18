package cinema.db.repos;

import cinema.db.entities.Hall;
import cinema.dto.CapacityOfHalls;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HallRepository extends CrudRepository <Hall, Long> {

    List<Hall> finbByName (String hallName);

    default Hall findEmpty (String hallName, int capacity){
        Hall hall = new Hall(hallName, capacity);
        if (capacity <= CapacityOfHalls.FULLCAPACITY.getCapacityOfHalls()) {
            return hall;
        } else {
            return null;
        }
    }
}

