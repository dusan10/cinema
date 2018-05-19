package cinema.dto;

import java.io.Serializable;
import java.util.Objects;

public class Reservation implements Serializable {

    private int idReservation;
    private String resrevationName;
    private int idHall;
    private int idUser;
    private int idMovie;

    public Reservation(int idReservation, String resrevationName, int idHall, int idUser, int idMovie) {
        this.idReservation = idReservation;
        this.resrevationName = resrevationName;
        this.idHall = idHall;
        this.idUser = idUser;
        this.idMovie = idMovie;
    }

    public Reservation(int idReservation, String resrevationName, Hall hall, User user, Movie movie) {
        this.idReservation = idReservation;
        this.resrevationName = resrevationName;
        this.idHall = hall.getIdHall();
        this.idUser = user.getIdUser();
        this.idMovie = movie.getIdMovie();
    }

    public int getIdReservation() {
        return idReservation;
    }

    public String getResrevationName() {
        return resrevationName;
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
                Objects.equals(resrevationName, that.resrevationName) &&
                Objects.equals(idHall, that.idHall) &&
                Objects.equals(idUser, that.idUser) &&
                Objects.equals(idMovie, that.idMovie);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idReservation, resrevationName, idHall, idUser, idMovie);
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "idReservation=" + idReservation +
                ", resrevationName='" + resrevationName + '\'' +
                ", idHall=" + idHall +
                ", idUser=" + idUser +
                ", idMovie=" + idMovie +
                '}';
    }
}
