package cinema.db.repos;

import cinema.db.entities.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository <Movie, Long> {
}
