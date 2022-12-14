package pl.sdacademy.unit.test.advance.exercises.mockito.user;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(Long id);

    User addUser(UserDto userDto);
}