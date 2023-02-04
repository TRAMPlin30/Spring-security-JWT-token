package tramplin.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tramplin.security.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> { //because ID of USER is integer

    Optional<User> findByEmail(String email);
}
