package jeffersonrolino.com.github.spring_store.repositories;

import jeffersonrolino.com.github.spring_store.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
