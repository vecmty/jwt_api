package lol.vecmty.jwtappdemo.service;

import lol.vecmty.jwtappdemo.model.User;

import java.util.List;

/**
 * Service interface for class {@link User}.
 *
 * @author
 * @version 1.0
 */

public interface UserService {

    boolean register(User user);

    List<User> getAll();

    User findByUsername(String username);

    User findById(Long id);

    void delete(Long id);
}
