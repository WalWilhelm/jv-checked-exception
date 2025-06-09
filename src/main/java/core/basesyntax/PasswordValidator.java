package core.basesyntax;

public class PasswordValidator {
    public static void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Password or repeated password cannot be null");
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Passwords do not match");
        }
        if (password.length() < 8) {
            throw new PasswordValidationException("Password must be at least 8 characters long");
        }
        // Здесь можно добавить дополнительные проверки, например наличие цифр, спецсимволов и т.д.
    }
}




