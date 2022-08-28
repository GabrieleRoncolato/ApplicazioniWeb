package it.univr.applicazioniweb.service;

import it.univr.applicazioniweb.model.InTest;
import it.univr.applicazioniweb.model.Test;
import it.univr.applicazioniweb.repository.InTestRepository;
import it.univr.applicazioniweb.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class StudentsService implements IStudentsService {
    @Autowired
    private TestRepository testRepository;

    @Override
    public List<Test> allTests(){
        return (List<Test>) testRepository.findAll();
    }

    @Override
    public String findTest(OffsetDateTime dataTest, String nomeTest){
        Optional<Test> inTestResult = testRepository.findByDataAndNome(dataTest, nomeTest);
        return inTestResult.map(inTest -> inTest.getNome()).orElse(null);
    }
}
