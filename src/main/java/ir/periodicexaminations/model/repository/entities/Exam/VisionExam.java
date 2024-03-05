package ir.periodicexaminations.model.repository.entities.Exam;

import ir.periodicexaminations.model.repository.entities.Employee;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "VisionExams")
public class VisionExam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vexamId;
    @Temporal(TemporalType.DATE)
    private Date dateExamination;
    private float rightVision;
    private float leftVision;

    @ManyToOne
    @JoinColumn(name = "exam_file_id")
    private ExamFile vExamFileId;


}
