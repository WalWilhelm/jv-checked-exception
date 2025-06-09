package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        User user = new User("email@email.com", "1234567890", "1234567890");
        String result = userService.registerUser(user);

        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("Failed to register user.");
        }
    }
}

