package ir.periodicexaminations.model.repository;

import ir.periodicexaminations.model.entities.BloodExam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloodExamRepository extends JpaRepository<BloodExam, Long> {
}
