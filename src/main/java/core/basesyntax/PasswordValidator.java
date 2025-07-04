package core.basesyntax;

public class PasswordValidator {
    public static void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password == null || repeatPassword == null
                || !password.equals(repeatPassword)
                || password.length() < 6) {
            throw new PasswordValidationException("Passwords do not match or are invalid");
        }
    }
}





