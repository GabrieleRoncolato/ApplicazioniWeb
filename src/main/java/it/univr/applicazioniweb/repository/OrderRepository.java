package it.univr.applicazioniweb.repository;

import it.univr.applicazioniweb.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
