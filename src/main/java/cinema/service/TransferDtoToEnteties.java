package cinema.service;

import cinema.db.repos.HallRepository;
import cinema.db.repos.MovieRepository;
import cinema.db.repos.ReservationRepository;
import cinema.db.repos.UserRepository;
import cinema.dto.Hall;
import cinema.dto.Movie;
import cinema.dto.Reservation;
import cinema.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TransferDtoToEnteties {

    @Autowired
    private HallRepository hallRepository;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ReservationRepository reservationRepository;

    public ResponseEntity <Hall> update (Hall hall){
       cinema.db.entities.Hall hallEntity = dtoToEntityHall(hall);
       hallRepository.save(hallEntity);
       return new ResponseEntity<>(hall, HttpStatus.OK);

    }

    public ResponseEntity <Movie> update (Movie movie){
        cinema.db.entities.Movie movieEntity = dtoToEntityMovie(movie);
        movieRepository.save(movieEntity);
        return new ResponseEntity<>(movie, HttpStatus.OK);

    }

    public ResponseEntity <User> update (User user){
        cinema.db.entities.User userEntity = dtoToEntityUser(user);
        userRepository.save(userEntity);
        return new ResponseEntity<>(user, HttpStatus.OK);

    }

    public ResponseEntity <Reservation> update (Reservation reservation){
        cinema.db.entities.Reservation reservationEntity = dtoToEntityReservation(reservation);
        reservationRepository.save(reservationEntity);
        return new ResponseEntity<>(reservation, HttpStatus.OK);

    }

    private cinema.db.entities.Hall dtoToEntityHall(Hall hall) {
        return new cinema.db.entities.Hall(hall.getHallName(), hall.getCapacity());
    }

    private cinema.db.entities.Movie dtoToEntityMovie(Movie movie) {
        return new cinema.db.entities.Movie(movie.getMovieName() ,  movie.getMovieTime());
    }

    private cinema.db.entities.User dtoToEntityUser(User user) {
        return new cinema.db.entities.User(user.getUserName(), user.getUserSurname(), user.getEmail(), user.getMobile());
    }

    private cinema.db.entities.Reservation dtoToEntityReservation(Reservation reservation) {
        return new cinema.db.entities.Reservation(reservation.getHall(), reservation.getUser(), reservation.getMovie());
    }

}
