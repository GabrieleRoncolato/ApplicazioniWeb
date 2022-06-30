package it.univr.applicazioniweb.service;


import it.univr.applicazioniweb.model.Order;

import java.util.List;

public interface IOrderService {
    List<Order> findAll();
}
