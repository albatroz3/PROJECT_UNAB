package unab.reto345.crud;

import org.springframework.data.repository.CrudRepository;
import unab.reto345.model.Score;

public interface ScoreCrudRepository extends CrudRepository<Score, Integer> {
}
