package ir.periodicexaminations.model.implementRepositories;

import ir.periodicexaminations.model.repository.entities.BloodExam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloodExamRepository extends JpaRepository<BloodExam, Long> {
}
