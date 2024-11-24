package pe.edu.cibertec.apprestventas.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.apprestventas.model.Category;
import pe.edu.cibertec.apprestventas.repository.CategoryRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoryService implements ICategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return List.of();
    }

    @Override
    public Category findById(int id) {
        return null;
    }

    @Override
    public void save(Category category) {

    }
}
