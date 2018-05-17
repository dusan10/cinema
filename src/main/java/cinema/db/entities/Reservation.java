package cinema.db.entities;

import cinema.dto.Hall;
import cinema.dto.Movie;
import cinema.dto.User;

import javax.persistence.*;

@Entity
@Table(name = "Reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReservation")
    private int idReservation;
    @Column(name = "hall")
    private Hall hall;
    @Column(name = "user")
    private User user;
    @Column(name = "movie")
    private Movie movie;


}
