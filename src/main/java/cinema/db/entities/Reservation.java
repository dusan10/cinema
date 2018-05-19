package cinema.db.entities;

import cinema.dto.Hall;
import cinema.dto.Movie;
import cinema.dto.User;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservation")
    @PrimaryKeyJoinColumn
    private int idReservation;
    @Column (name = "reservation_hall")
    private String reservationName;
    @Column(name = "id_hall")
    private int idHall;
    @Column(name = "id_user")
    private int idUser;
    @Column(name = "id_movie")
    private int idMovie;

    public Reservation(String reservationName, int idHall, int idUser, int idMovie) {
        this.reservationName = reservationName;
        this.idHall = idHall;
        this.idUser = idUser;
        this.idMovie = idMovie;
    }

    public Reservation(String reservationName, Hall hall, User user, Movie movie) {
        this.reservationName = reservationName;
        this.idHall = hall.getIdHall();
        this.idUser = user.getIdUser();
        this.idMovie = movie.getIdMovie();
    }

    public int getIdReservation() {
        return idReservation;
    }

    public String getReservationName() {
        return reservationName;
    }

    public int getIdHall() {
        return idHall;
    }

    public int getIdUser() {
        return idUser;
    }

    public int getIdMovie() {
        return idMovie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return idReservation == that.idReservation &&
                Objects.equals(reservationName, that.reservationName) &&
                Objects.equals(idHall, that.idHall) &&
                Objects.equals(idUser, that.idUser) &&
                Objects.equals(idMovie, that.idMovie);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idReservation, reservationName, idHall, idUser, idMovie);
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "idReservation=" + idReservation +
                ", reservationName='" + reservationName + '\'' +
                ", idHall=" + idHall +
                ", idUser=" + idUser +
                ", idMovie=" + idMovie +
                '}';
    }
}
