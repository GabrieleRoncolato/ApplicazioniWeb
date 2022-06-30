package it.univr.applicazioniweb.service;

import it.univr.applicazioniweb.model.Customer;
import it.univr.applicazioniweb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
        @Autowired
        private CustomerRepository customerRepository;

        @Override
        public List<Customer> findAll(){
            return (List<Customer>) customerRepository.findAll();
        }
}
