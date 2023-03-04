import java.util.Objects;

public class User {
    public  String login;
    public   String email;

    public User createUser(String login, String email) {
        if (login != null && !login.isEmpty() && email != null && !email.isEmpty()) {
            User unit = new User(login, email);
            return unit;
        }
        throw new IllegalArgumentException();
    }


    public User(String login, String email) {
        this.login = login;
        this.email = email;
    }

    public User() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User unit = (User) o;
        return Objects.equals(login, unit.login) && Objects.equals(email, unit.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email);
    }

    @Override
    public String toString() {
        return "Unit{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
