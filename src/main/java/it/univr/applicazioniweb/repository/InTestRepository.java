package it.univr.applicazioniweb.repository;

import it.univr.applicazioniweb.model.InTest;
import org.springframework.data.repository.CrudRepository;

import java.sql.Timestamp;
import java.util.Optional;

public interface InTestRepository extends CrudRepository<InTest, Long> {
    //Optional<InTest> findByDataTestAndNomeTest(Timestamp dataTest, String nomeTest);
}
