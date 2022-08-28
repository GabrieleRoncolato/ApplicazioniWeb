package it.univr.applicazioniweb.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

public class TestKey implements Serializable {
    private OffsetDateTime data;
    private String nome;
}
