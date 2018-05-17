package cinema.db.repos;

import cinema.db.entities.Hall;
import org.springframework.data.repository.CrudRepository;

public interface HallRepository extends CrudRepository <Hall, Long> {
}
