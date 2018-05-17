package cinema.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class Movie implements Serializable {

    private int idMovie;
    private String movieName;
    private LocalDate movieTime;

    public Movie(int idMovie, String movieName, LocalDate movieTime) {
        this.idMovie = idMovie;
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

        Movie movies = (Movie) o;

        if (idMovie != movies.idMovie) return false;
        if (movieName != null ? !movieName.equals(movies.movieName) : movies.movieName != null) return false;
        return movieTime != null ? movieTime.equals(movies.movieTime) : movies.movieTime == null;
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
