import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {
    public static final String DEFAULT_LOGIN = "Ivan Ivanov";
    public static final String DEFAULT_EMAIL = "ivanivanov@mail.com";
    public static final String DEFAULT_MESSAGE = "Пользователь создан ";

    private final User out = new User(DEFAULT_LOGIN,DEFAULT_EMAIL);

    User user;

    @BeforeEach
    void prepareData() {
        user = out.createUser(DEFAULT_LOGIN, DEFAULT_EMAIL);
    }


    @Test
    public void shouldCreateUserWithTwoPar() throws IllegalAccessException {
        Assertions.assertTrue(user.getLogin().equals(DEFAULT_LOGIN) && user.getEmail().equals(DEFAULT_EMAIL));

    }

    @Test
    public void shouldCreateUserNoPar() {
        user = new User();
        Assertions.assertTrue(user.getLogin() == null && user.getEmail() == null);
    }

    @Test
    public void shouldCorrectEmail() {
        Assertions.assertTrue(user.getEmail().contains("@") && user.getEmail().contains("."));
    }

    @Test
    public void shouldLoginAndEmailNotEquals() {
        Assertions.assertNotEquals(user.getLogin(), user.getEmail());
    }




}