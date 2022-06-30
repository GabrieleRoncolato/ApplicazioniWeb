package it.univr.applicazioniweb.service;

import it.univr.applicazioniweb.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
}
