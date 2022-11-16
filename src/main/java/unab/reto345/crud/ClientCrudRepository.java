package unab.reto345.crud;

import org.springframework.data.repository.CrudRepository;
import unab.reto345.model.Client;

public interface ClientCrudRepository extends CrudRepository<Client, Integer> {
}
