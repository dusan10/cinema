package cinema.db.entities;


import javax.persistence.*;

@Entity
@Table (name = "Hall")
public class Hall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idHall")
    private int idHall;
    @Column(name = "hallName")
    private String hallName;
    @Column(name = "capacity")
    private int capacity;



    public Hall(String hallName, int capacity) {
        this.hallName = hallName;
        this.capacity = capacity;
    }

    public int getIdHall() {
        return idHall;
    }

    public String getHallName() {
        return hallName;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hall hall = (Hall) o;

        if (idHall != hall.idHall) return false;
        if (capacity != hall.capacity) return false;
        return hallName != null ? hallName.equals(hall.hallName) : hall.hallName == null;
    }

    @Override
    public int hashCode() {
        int result = idHall;
        result = 31 * result + (hallName != null ? hallName.hashCode() : 0);
        result = 31 * result + capacity;
        return result;
    }

    @Override
    public String toString() {
        return "Hall{" +
                "idHall=" + idHall +
                ", hallName='" + hallName + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
