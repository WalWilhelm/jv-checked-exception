package core.basesyntax;

public class UserService {
    public String registerUser(User user) {
        try {
            PasswordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
            return "User " + user.getUsername() + " was saved to database!!!";
        } catch (PasswordValidationException e) {
            return "Your passwords are incorrect. Try again.";
        }
    }

    private void saveUser(User user) {
        // Здесь имитация сохранения пользователя
        System.out.println("Saving user " + user.getUsername());
    }
}





