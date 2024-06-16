package jeffersonrolino.com.github.spring_store.repositories;

import jeffersonrolino.com.github.spring_store.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
