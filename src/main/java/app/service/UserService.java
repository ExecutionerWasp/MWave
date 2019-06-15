package app.service;

import app.domain.User;

import java.util.Optional;

/**
 * @author Alvin
 **/

public interface UserService {

    Optional<User> findById(String id);

    User save(User user);
}
