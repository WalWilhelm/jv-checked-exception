package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("john_doe", "1234567890", "1234567890");
        User user2 = new User("jane_doe", "pass", "pass123");

        UserService userService = new UserService();
        userService.registerUser(user1); //
        userService.registerUser(user2); //
    }
}
