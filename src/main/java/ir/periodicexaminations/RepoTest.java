package ir.periodicexaminations;

import ir.periodicexaminations.control.services.EmployeeService;
import ir.periodicexaminations.model.impRepos.EmployeeRepository;
import ir.periodicexaminations.model.impRepos.ExamRepository;
import ir.periodicexaminations.model.impRepos.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RepoTest implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;
    private final ExamRepository examRepository;
    private final UserRepository userRepository;

    public RepoTest(EmployeeRepository employeeRepository, ExamRepository examRepository, UserRepository userRepository) {
        this.employeeRepository = employeeRepository;
        this.examRepository = examRepository;
        this.userRepository = userRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        /*
        Employee e1 = new Employee();
        e1.setEmpName("ali");
        e1.setEmpFamily("mirzaei");
        e1.setNationalCode("0078061210");

        User u = new User();
        u.setUserName(e1.getNationalCode());
        u.setPassword("123456");
        userRepository.save(u);

        e1.setUser(u);
        employeeRepository.save(e1);

        System.out.println(e1.toString());


        Employee e2 = new Employee();
        e2.setEmpName("saeed");
        e2.setEmpFamily("rezazade");
        e2.setNationalCode("0078561512");

        User u2 = new User();
        u2.setUserName(e2.getNationalCode());
        u2.setPassword("123456");
        userRepository.save(u2);

        e2.setUser(u2);
        employeeRepository.save(e2);

        System.out.println(e2.toString());


        Employee e3 = new Employee();
        e3.setEmpName("arash");
        e3.setEmpFamily("yoosefi");
        e3.setNationalCode("4952065461");
        //employeeRepository.save(e3);

        User u3 = new User();
        u3.setUserName(e3.getNationalCode());
        u3.setPassword("123456");
        userRepository.save(u3);

        e3.setUser(u3);
        employeeRepository.save(e3);

        System.out.println(e3.toString());


        Employee e4 = new Employee();
        e4.setEmpName("mostafa");
        e4.setEmpFamily("safari");
        e4.setNationalCode("5897546231");
      //  employeeRepository.save(e4);

        User u4 = new User();
        u4.setUserName(e4.getNationalCode());
        u4.setPassword("123456");
        userRepository.save(u4);

        e4.setUser(u4);
        employeeRepository.save(e4);

        System.out.println(e4.toString());

        Employee e5 = new Employee();
        e5.setEmpName("zahra");
        e5.setEmpFamily("zareei");
        e5.setNationalCode("8754216532");
//        employeeRepository.save(e5);

        User u5 = new User();
        u5.setUserName(e5.getNationalCode());
        u5.setPassword("123456");
        userRepository.save(u5);

        e5.setUser(u5);
        employeeRepository.save(e5);

        System.out.println(e5.toString());


        Employee e6 = new Employee();
        e6.setEmpName("fatemeh");
        e6.setEmpFamily("azarpeiqe");
        e6.setNationalCode("9865324578");
  //      employeeRepository.save(e6);

        User u6 = new User();
        u6.setUserName(e6.getNationalCode());
        u6.setPassword("123456");
        userRepository.save(u6);

        e6.setUser(u6);
        employeeRepository.save(e6);

        System.out.println(e6.toString());


         */



    }
}