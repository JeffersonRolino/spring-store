package jeffersonrolino.com.github.spring_store.repositories;

import jeffersonrolino.com.github.spring_store.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
