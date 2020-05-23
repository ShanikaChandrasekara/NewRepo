package com.one23.official.resource;

import com.one23.official.model.Category;
import com.one23.official.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CategoryController {

    @Autowired
    private CategoryRepository repository;

    @PostMapping("/addCategory")
    public String saveCategory(@RequestBody Category category){
        repository.save(category);
        return "Added category with ID : " + category.getId();
    }

    @GetMapping("/findAllCategories")
    public List<Category> getCategories(){
        return repository.findAll();
    }

    @GetMapping("/findAllCategories/{id}")
    public Optional<Category> getOneCategoryById(@PathVariable String id){
        return repository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCategory(@PathVariable String id){
        repository.deleteById(id);
        return "Category deleted with ID : " + id;
    }

  

}
