package ir.periodicexaminations.model.implementRepositories.examRepositories;

import ir.periodicexaminations.model.repository.entities.Exam.BloodExam;
import ir.periodicexaminations.model.repository.entities.Exam.HearingExam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HearingExamRepository extends JpaRepository<HearingExam, Long> {
}
