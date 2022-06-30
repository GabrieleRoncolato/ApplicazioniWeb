package it.univr.applicazioniweb.service;

import it.univr.applicazioniweb.model.Agent;

import java.util.List;

public interface IAgentService {
    List<Agent> findAll();
    String getContact(String agentCode);
}
