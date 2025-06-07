package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        try {
            PasswordValidator.validate(user);
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    private void saveUser(User user) {
        // Имитируем сохранение пользователя
        System.out.println("User " + user.getUsername() + " has been registered successfully.");
    }
}

