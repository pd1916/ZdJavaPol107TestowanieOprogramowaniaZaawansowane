package pl.sdacademy.unit.test.advance.exercises.mockito.user;

import java.util.Optional;

public class UserService {
    private final UserRepository userRepository;
    private final UserValidator userValidator;

    public UserService(final UserRepository userRepository, final UserValidator userValidator) {
        this.userRepository = userRepository;
        this.userValidator = userValidator;
    }

    public User getUserById(final Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    public User createUser(final String firstName, final String lastName) {
        UserDto userDto = new UserDto(firstName, lastName.toUpperCase());
        if (userValidator.isUserValid(userDto)) {
            return userRepository.addUser(userDto);
        }
        throw new IllegalArgumentException("User is invalid");
    }
}