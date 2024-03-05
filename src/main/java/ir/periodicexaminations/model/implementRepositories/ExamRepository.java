package ir.periodicexaminations.model.implementRepositories;

import ir.periodicexaminations.model.repository.entities.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {
}
