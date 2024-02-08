package ir.periodicexaminations.repository;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Examination {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long exId;

    private Timestamp dateExamination;
    private int cbc;
    private int wbc;
    private int hemoglobin;

}
