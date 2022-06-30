package it.univr.applicazioniweb.repository;

import it.univr.applicazioniweb.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
