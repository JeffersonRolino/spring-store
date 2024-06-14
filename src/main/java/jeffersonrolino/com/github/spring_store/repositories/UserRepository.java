package jeffersonrolino.com.github.spring_store.repositories;

import jeffersonrolino.com.github.spring_store.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
