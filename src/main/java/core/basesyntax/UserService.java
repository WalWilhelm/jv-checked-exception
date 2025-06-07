package core.basesyntax;

public class UserService {
    public String registerUser(User user) throws PasswordValidationException {
        if (!PasswordValidator.validate(user.getPassword(), user.getRepeatPassword())) {
            return "Validation failed.";
        }

        return "User " + user.getUsername() + " was saved to database!!!";
    }
}




