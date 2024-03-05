package ir.periodicexaminations.model.implementRepositories.examRepositories;

import ir.periodicexaminations.model.repository.entities.Exam.BloodExam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloodExamRepository extends JpaRepository<BloodExam, Long> {
}
