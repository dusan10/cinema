package cinema.db.repos;

import cinema.db.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository <Reservation, Long> {
}
