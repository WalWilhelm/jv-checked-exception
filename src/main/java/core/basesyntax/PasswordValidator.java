package core.basesyntax;

public class PasswordValidator {
    public static void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Password or repeated password can't be null");
        }
        if (!password.equals(repeatPassword)
                || password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}

