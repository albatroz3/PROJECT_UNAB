package unab.reto345.crud;

import org.springframework.data.repository.CrudRepository;
import unab.reto345.model.Category;

public interface CategoryCrudRepository extends CrudRepository<Category, Integer> {
}
