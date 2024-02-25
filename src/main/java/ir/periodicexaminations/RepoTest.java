package ir.periodicexaminations;

import ir.periodicexaminations.model.impRepos.EmployeeRepository;
import ir.periodicexaminations.model.impRepos.ExamRepository;
import ir.periodicexaminations.model.impRepos.UserRepository;
import ir.periodicexaminations.model.repository.Employee;
import ir.periodicexaminations.model.repository.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RepoTest implements CommandLineRunner {

    private EmployeeRepository employeeRepository;
    private final ExamRepository examRepository;
    private final UserRepository userRepository;

    public RepoTest(EmployeeRepository employeeRepository, ExamRepository examRepository, UserRepository userRepository) {
        this.employeeRepository = employeeRepository;
        this.examRepository = examRepository;
        this.userRepository = userRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        Employee e1 = new Employee();
        e1.setEmpName("ali");
        e1.setEmpFamily("mirzaei");
        e1.setNationalCode("0078061210");

        employeeRepository.save(e1);

        System.out.println(e1.toString());


//        User u1 = new User();
//        u1.setUserName("nationalcode");
//        u1.setPassword("123456");
//        u1.setEmployee(e1);
//        userRepository.save(u1);


    }


}
