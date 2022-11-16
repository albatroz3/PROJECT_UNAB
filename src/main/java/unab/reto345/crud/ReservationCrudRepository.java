package unab.reto345.crud;

import org.springframework.data.repository.CrudRepository;
import unab.reto345.model.Reservation;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
}
