package core.basesyntax;

public class UserService {
    private final UserRepository userRepository = new UserRepository();

    public void registerUser(String login, String password, String repeatPassword)
            throws PasswordValidationException {

        // Проверяем пароли (в том числе на null)
        PasswordValidator.validate(password, repeatPassword);

        // Создаем пользователя и задаем поля
        User user = new User();
        user.setLogin(login);
        user.setPassword(password);
        user.setRepeatPassword(repeatPassword);

        // Сохраняем пользователя в базу
        userRepository.save(user);
    }
}


