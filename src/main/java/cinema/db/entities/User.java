package cinema.db.entities;

import javax.persistence.*;


@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_user")
    private int idUser;
    @Column (name = "user_name")
    private String userName;
    @Column (name = "user_surname")
    private String userSurname;
    @Column (name = "email")
    private String email;
    @Column (name = "mobile")
    private String mobile;

    public User(String userName, String userSurname, String email, String mobile) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.email = email;
        this.mobile = mobile;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (idUser != user.idUser) return false;
        if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;
        if (userSurname != null ? !userSurname.equals(user.userSurname) : user.userSurname != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        return mobile != null ? mobile.equals(user.mobile) : user.mobile == null;
    }

    @Override
    public int hashCode() {
        int result = idUser;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userSurname != null ? userSurname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
