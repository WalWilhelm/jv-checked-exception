package core.basesyntax;

public class UserService {
    public String registerUser(String login, String password, String repeatPassword)
            throws PasswordValidationException {

        if (!PasswordValidator.validate(password, repeatPassword)) {
            return "Validation failed.";
        }

        User user = new User(login, password, repeatPassword);
        return "User " + user.getUsername() + " was saved to database!!!";
    }
}



