package it.univr.applicazioniweb;

import it.univr.applicazioniweb.model.Agent;
import it.univr.applicazioniweb.model.Customer;
import it.univr.applicazioniweb.model.Order;
import it.univr.applicazioniweb.service.IAgentService;
import it.univr.applicazioniweb.service.ICustomerService;
import it.univr.applicazioniweb.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class WebApplicationController {
    @Autowired
    private ICustomerService customerService;

    @Autowired
    private IAgentService agentService;

    @Autowired
    private IOrderService orderService;

    @SchemaMapping(typeName = "Query", field = "getAllCustomers")
    public List<Customer> getAllCustomers(){
        return customerService.findAll();
    }

    @SchemaMapping(typeName = "Query", field = "getFirstCustomer")
    public Optional<Customer> getFirstCustomer(){
        return customerService.findAll().stream().findFirst();
    }

    @SchemaMapping(typeName = "Query", field = "getFirstAgent")
    public Optional<Agent> getFirstAgent(){
        return agentService.findAll().stream().findFirst();
    }

    @SchemaMapping(typeName = "Query", field = "getFirstOrder")
    public Optional<Order> getFirstOrder(){
        return orderService.findAll().stream().findFirst();
    }

    @SchemaMapping(typeName = "Query", field = "agentContact")
    public String agentContact(@Argument String agentCode){
        return agentService.getContact(agentCode);
    }
}
