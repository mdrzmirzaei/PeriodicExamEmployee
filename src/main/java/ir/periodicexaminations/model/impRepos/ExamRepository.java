package ir.periodicexaminations.model.impRepos;

import ir.periodicexaminations.model.repository.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<Exam,Long> {

}
