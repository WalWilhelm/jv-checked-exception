package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User("email@email", "1234567890", "1234567890"); // пароль длиной 10 символов

        String result = userService.registerUser(user);
        System.out.println(result);
    }
}

