package resturant.acl.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import resturant.acl.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

}