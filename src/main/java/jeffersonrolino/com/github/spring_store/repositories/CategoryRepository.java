package jeffersonrolino.com.github.spring_store.repositories;

import jeffersonrolino.com.github.spring_store.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
