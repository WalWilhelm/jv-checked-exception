package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        try {
            String result = userService.registerUser("email@email", "123456", "123456");
            System.out.println(result);
        } catch (PasswordValidationException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }
    }
}

