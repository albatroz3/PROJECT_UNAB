package unab.reto345.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import unab.reto345.model.Category;
import unab.reto345.service.CategoryService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/Category")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class  CategoryController {

    @Autowired
    private CategoryService categoryService;
    @GetMapping("/All*")
    public List<Category> getCategories(){
        return categoryService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Category> getCategory(@PathVariable("id") int id){
        return categoryService.getCategory(id);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Category save(@RequestBody Category category){
        return categoryService.save(category);
    }
    @PutMapping("/update")
    public Category update(@RequestBody Category category) {
        return categoryService.update(category);
    }
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") int id){
        return categoryService.delete(id);
    }
}
