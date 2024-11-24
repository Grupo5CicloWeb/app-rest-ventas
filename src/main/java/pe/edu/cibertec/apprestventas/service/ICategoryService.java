package pe.edu.cibertec.apprestventas.service;

import pe.edu.cibertec.apprestventas.model.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {

    List<Category> findAll();

    Optional<Category> findById(int id);

    void save(Category category);

}
