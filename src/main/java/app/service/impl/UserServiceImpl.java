package app.service.impl;

import app.domain.User;
import app.repos.UserRepos;
import app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Alvin
 **/
@Service
public class UserServiceImpl implements UserService {

    private final UserRepos userRepos;

    @Autowired
    public UserServiceImpl(UserRepos userRepos) {
        this.userRepos = userRepos;
    }

    @Override
    public Optional<User> findById(String id) {
        return userRepos.findById(id);
    }

    @Override
    public User save(User user) {
        return userRepos.save(user);
    }
}
