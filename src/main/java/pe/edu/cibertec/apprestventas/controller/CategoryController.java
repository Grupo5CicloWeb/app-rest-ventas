package pe.edu.cibertec.apprestventas.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.apprestventas.exception.ResourceNotFoundException;
import pe.edu.cibertec.apprestventas.model.Category;
import pe.edu.cibertec.apprestventas.service.ICategoryService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {

    private final ICategoryService categoryService;
    @GetMapping
    public ResponseEntity<List<Category>>
        listarCategorias() {
        List<Category> categoryList =
                categoryService.findAll();
        if(categoryList.isEmpty()){
            return new ResponseEntity<>(
                    HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categoryList,
                HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Category> obtenerCategoria
            (@PathVariable Integer id) {
        Category category = categoryService
                .findById(id).orElseThrow(()
                -> new ResourceNotFoundException("La categoria con ID "
                        + id + " no existe"));
        return new ResponseEntity<>(category,
                HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Category> guardarCategoria(
            @RequestBody Category category) {
        return new ResponseEntity<>(
                categoryService.save(category),
                HttpStatus.CREATED);
    }



}
