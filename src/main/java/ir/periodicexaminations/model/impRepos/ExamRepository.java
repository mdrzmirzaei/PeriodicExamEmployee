package ir.periodicexaminations.model.impRepos;

import ir.periodicexaminations.model.repository.Exam;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends CrudRepository<Exam,Long> {

}
