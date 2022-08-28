package it.univr.applicazioniweb;

import it.univr.applicazioniweb.model.Test;
import it.univr.applicazioniweb.service.IStudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.List;

@RestController
public class WebApplicationController {
    @Autowired
    private IStudentsService studentsService;

    /*
    @SchemaMapping(typeName = "Query", field = "login")
    public String login(@Argument AccessData accessData){
        UsernamePasswordAuthenticationToken authReq = new UsernamePasswordAuthenticationToken(accessData.getUsername(), accessData.getPassword());
        SecurityContext sc = SecurityContextHolder.getContext();

        System.out.println(sc.getAuthentication().isAuthenticated());

        Authentication auth = authenticationManager.authenticate(authReq);
        sc.setAuthentication(auth);

        System.out.println(sc.getAuthentication().isAuthenticated());
        System.out.println(sc.getAuthentication().getName());

        return auth.getName();
    }*/

    /*
    @AdminSecured
    @SchemaMapping(typeName = "Query", field = "allCustomers")
    public List<Customer> allCustomers(){
        return customerService.findAll();
    }

    @AdminSecured
    @SchemaMapping(typeName = "Query", field = "allAgents")
    public List<Agent> allAgents(){ return agentService.findAll(); }

    @AdminSecured
    @SchemaMapping(typeName = "Query", field = "allOrders")
    public List<Test> allOrders(){ return orderService.findAll(); }
    */

    @SchemaMapping(typeName = "Query", field = "testName")
    public String testName(@Argument OffsetDateTime dataTest, @Argument String nomeTest){
        return studentsService.findTest(dataTest, nomeTest);
    }

    @SchemaMapping(typeName = "Query", field = "allTests")
    public List<Test> allTests(){
        return studentsService.allTests();
    }

    /*
    @AgentSecured
    @SchemaMapping(typeName = "Query", field = "custContact")
    public String customerContact(@Argument String custCode){ return customerService.getContact(custCode); }

    @SchemaMapping(typeName = "Query", field = "agentOrders")
    public List<Test> agentOrders(@Argument String agentCode){
        return orderService.findAgentOrders(agentCode);
    }

    @SchemaMapping(typeName = "Query", field = "custOrders")
    public List<Test> custOrders(@Argument String custCode){
        return orderService.findCustOrders(custCode);
    }

    @AdminSecured
    @SchemaMapping(typeName = "Mutation", field = "modifyAgent")
    public Agent modifyAgent(@Argument String agentCode, @Argument AgentInput agentInput){
        return agentService.modifyAgent(agentCode, agentInput);
    }

    @AdminSecured
    @SchemaMapping(typeName = "Mutation", field = "modifyCustomer")
    public Customer modifyCustomer(@Argument String custCode, @Argument CustomerInput customerInput){
        return customerService.modifyCustomer(custCode, customerInput);
    }

    @SchemaMapping(typeName = "Mutation", field = "modifyOrder")
    public Test modifyOrder(@Argument Long ordNum, @Argument OrderInput orderInput){
        return orderService.modifyOrder(ordNum, orderInput);
    }

    @SchemaMapping(typeName = "Mutation", field = "addOrder")
    public Test addOrder(@Argument OrderInput orderInput){
        return orderService.addOrder(orderInput);
    }

    @SchemaMapping(typeName = "Mutation", field = "deleteOrder")
    public Long deleteOrder(@Argument Long ordNum){
        return orderService.deleteOrder(ordNum);
    }*/
}
