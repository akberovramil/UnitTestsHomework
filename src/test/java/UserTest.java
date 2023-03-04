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
        Assertions.assertTrue(result.equals(new User(DEFAULT_LOGIN,DEFAULT_EMAIL)));

    }

    @Test
    public void shouldCreateUserNoPar() {
        User result = out.createUser(DEFAULT_LOGIN,DEFAULT_EMAIL);
        Assertions.assertFalse(!result.equals(new User(DEFAULT_LOGIN,DEFAULT_EMAIL)));
    }

    @Test
    public void shouldCorrectEmail() {
        String email = DEFAULT_EMAIL;
        Assertions.assertTrue(email.contains("@") && email.contains("."));
    }

    @Test
    public void shouldLoginAndEmailNotEquals() {
        Assertions.assertFalse(DEFAULT_EMAIL.equals(DEFAULT_LOGIN));
    }




}