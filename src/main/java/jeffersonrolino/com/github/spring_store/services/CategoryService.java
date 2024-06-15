package jeffersonrolino.com.github.spring_store.services;

import jeffersonrolino.com.github.spring_store.entities.Category;
import jeffersonrolino.com.github.spring_store.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> optionalOrder = categoryRepository.findById(id);
        return optionalOrder.get();
    }

}
