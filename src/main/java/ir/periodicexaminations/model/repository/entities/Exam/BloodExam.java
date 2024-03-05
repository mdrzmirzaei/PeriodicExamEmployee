package ir.periodicexaminations.model.repository.entities.Exam;

import ir.periodicexaminations.model.repository.entities.Employee;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "bloodExams")
public class BloodExam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bexamId;
    @Temporal(TemporalType.DATE)
    private Date dateExamination;
    private int cbc;
    private int wbc;
    private int hemoglobin;

    @ManyToOne
    @JoinColumn(name = "exam_file_id")
    private ExamFile bExamFileId;


}
