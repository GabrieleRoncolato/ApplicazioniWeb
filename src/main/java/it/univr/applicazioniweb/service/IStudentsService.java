package it.univr.applicazioniweb.service;

import it.univr.applicazioniweb.model.Test;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.List;

public interface IStudentsService {
    List<Test> allTests();
    String findTest(OffsetDateTime dataTest, String nomeTest);
}
