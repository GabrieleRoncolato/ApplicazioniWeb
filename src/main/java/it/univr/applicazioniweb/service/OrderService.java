package it.univr.applicazioniweb.service;

import it.univr.applicazioniweb.model.Order;
import it.univr.applicazioniweb.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> findAll(){
        return (List<Order>) orderRepository.findAll();
    }
}