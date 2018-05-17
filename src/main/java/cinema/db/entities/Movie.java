package cinema.db.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMovie")
    private int idMovie;
    @Column(name = "movieName")
    private String movieName;
    @Column(name = "movieTime")
    private LocalDate movieTime;

    public Movie(String movieName, LocalDate movieTime) {
        this.movieName = movieName;
        this.movieTime = movieTime;
    }

    public int getIdMovie() {
        return idMovie;
    }

    public String getMovieName() {
        return movieName;
    }

    public LocalDate getMovieTime() {
        return movieTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        if (idMovie != movie.idMovie) return false;
        if (movieName != null ? !movieName.equals(movie.movieName) : movie.movieName != null) return false;
        return movieTime != null ? movieTime.equals(movie.movieTime) : movie.movieTime == null;
    }

    @Override
    public int hashCode() {
        int result = idMovie;
        result = 31 * result + (movieName != null ? movieName.hashCode() : 0);
        result = 31 * result + (movieTime != null ? movieTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "idMovie=" + idMovie +
                ", movieName='" + movieName + '\'' +
                ", movieTime=" + movieTime +
                '}';
    }
}
