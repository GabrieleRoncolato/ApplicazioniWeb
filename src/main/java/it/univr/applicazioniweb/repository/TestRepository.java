package it.univr.applicazioniweb.repository;

import it.univr.applicazioniweb.model.Test;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Optional;

public interface TestRepository extends CrudRepository<Test, Long> {
    Optional<Test> findByDataAndNome(OffsetDateTime data, String nome);
}
