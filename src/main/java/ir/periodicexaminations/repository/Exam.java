package ir.periodicexaminations.repository;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.naming.Name;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Exams")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long exId;

    private Timestamp dateExamination;
    private int cbc;
    private int wbc;
    private int hemoglobin;

    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

}
