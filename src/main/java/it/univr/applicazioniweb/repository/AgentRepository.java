package it.univr.applicazioniweb.repository;

import it.univr.applicazioniweb.model.Agent;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AgentRepository extends CrudRepository<Agent, Long> {
    Optional<Agent> findByAgentCode(String agentCode);
}
