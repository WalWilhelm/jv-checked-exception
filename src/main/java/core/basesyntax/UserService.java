package core.basesyntax;


public class UserService {
    public String registerUser(User user) {
        try {
            PasswordValidator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
            return null;
        }
        return saveUser(user);
    }

    public String saveUser(User user) {
        return "User " + user.getUsername() + " was saved to database!!!";
    }
}





