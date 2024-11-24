package pe.edu.cibertec.apprestventas.service;

import pe.edu.cibertec.apprestventas.model.Category;

import java.util.List;

public interface ICategoryService {

    List<Category> findAll();

    Category findById(int id);

    void save(Category category);

}
