package cinema.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class Reservation implements Serializable {

    private int idReservation;
    private Hall hall;
    private User user;
    private Movie movie;

    public Reservation(int idReservation, Hall hall, User user, Movie movie) {
        this.idReservation = idReservation;
        this.hall = hall;
        this.user = user;
        this.movie = movie;
    }

    public int getIdReservation() {
        return idReservation;
    }

    public Hall getHall() {
        return hall;
    }

    public User getUser() {
        return user;
    }

    public Movie getMovie() {
        return movie;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reservation that = (Reservation) o;

        if (idReservation != that.idReservation) return false;
        if (hall != null ? !hall.equals(that.hall) : that.hall != null) return false;
        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        return movie != null ? movie.equals(that.movie) : that.movie == null;
    }

    @Override
    public int hashCode() {
        int result = idReservation;
        result = 31 * result + (hall != null ? hall.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (movie != null ? movie.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "idReservation=" + idReservation +
                ", hall=" + hall +
                ", user=" + user +
                ", movie=" + movie +
                '}';
    }
}
