package core.basesyntax;

public class User {
    private final String username;
    private final String password;
    private final String repeatPassword;

    public User(String username, String password, String repeatPassword) {
        this.username = username;
        this.password = password;
        this.repeatPassword = repeatPassword;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    @Override
    public String toString() {
        return "User " + username;
    }
}


