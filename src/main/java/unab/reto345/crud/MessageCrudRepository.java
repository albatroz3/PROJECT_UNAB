package unab.reto345.crud;

import org.springframework.data.repository.CrudRepository;
import unab.reto345.model.Message;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}
