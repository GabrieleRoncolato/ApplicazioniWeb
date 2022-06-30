package it.univr.applicazioniweb.service;

import it.univr.applicazioniweb.model.Agent;
import it.univr.applicazioniweb.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgentService implements IAgentService {
    @Autowired
    private AgentRepository agentRepository;

    @Override
    public List<Agent> findAll(){
        return (List<Agent>) agentRepository.findAll();
    }

    @Override
    public String getContact(String agentCode){
        Optional<Agent> agentResult = agentRepository.findByAgentCode(agentCode);
        return agentResult.map(Agent::getPhoneNo).orElse(null);
    }
}
