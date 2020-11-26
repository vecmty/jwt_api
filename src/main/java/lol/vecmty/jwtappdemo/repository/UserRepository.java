package lol.vecmty.jwtappdemo.repository;

import lol.vecmty.jwtappdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface that extends {@link JpaRepository} for class {@link User}.
 *
 * @author
 * @version 1.0
 */

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String name);
}
