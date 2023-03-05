import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {
    public static final String DEFAULT_LOGIN = "Ivan Ivanov";
    public static final String DEFAULT_EMAIL = "ivanivanov@mail.com";
    public static final String DEFAULT_MESSAGE = "Пользователь создан ";

    private final User out = new User(DEFAULT_LOGIN,DEFAULT_EMAIL);


    @Test
    public void shouldCreateUserWithTwoPar() throws IllegalAccessException {
        User result = out.createUser(DEFAULT_LOGIN, DEFAULT_EMAIL);
        Assertions.assertTrue(result.getLogin().equals(DEFAULT_LOGIN) && result.getEmail().equals(DEFAULT_EMAIL));

    }

    @Test
    public void shouldCreateUserNoPar() {
        User result = new User();
        Assertions.assertTrue(result.getLogin() == null && result.getEmail() == null);
    }

    @Test
    public void shouldCorrectEmail() {
        User result = out.createUser(DEFAULT_LOGIN, DEFAULT_EMAIL);
        Assertions.assertTrue(result.getEmail().contains("@") && result.getEmail().contains("."));
    }

    @Test
    public void shouldLoginAndEmailNotEquals() {
        User result = out.createUser(DEFAULT_LOGIN, DEFAULT_EMAIL);
        Assertions.assertNotEquals(result.getLogin(), result.getEmail());
    }




}