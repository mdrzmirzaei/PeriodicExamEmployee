package ir.periodicexaminations.model.repository;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "exams")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long examId;

    private Timestamp dateExamination;
    private int cbc;
    private int wbc;
    private int hemoglobin;

    @ManyToOne
    private Employee employee;

}
