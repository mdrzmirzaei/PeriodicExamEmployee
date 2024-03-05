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
@Table(name = "hearingExams")
public class HearingExam  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long hExamId;
    @Temporal(TemporalType.DATE)
    private Date dateExamination;
    private float rightHearing;
    private float leftHearing;

    @ManyToOne
    @JoinColumn(name = "exam_file_id")
    private ExamFile hExamFileId;


}
