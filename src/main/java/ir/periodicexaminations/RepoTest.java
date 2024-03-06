package ir.periodicexaminations;


import ir.periodicexaminations.model.implementRepositories.EmployeeRepository;
import ir.periodicexaminations.model.implementRepositories.BloodExamRepository;
import ir.periodicexaminations.model.implementRepositories.UserRepository;
import ir.periodicexaminations.model.repository.entities.Employee;
import ir.periodicexaminations.model.repository.entities.BloodExam;
import ir.periodicexaminations.model.repository.entities.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.GregorianCalendar;

@Component
public class RepoTest implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;
    private final UserRepository userRepository;
    private final BloodExamRepository bloodExamRepository;


    public RepoTest(EmployeeRepository employeeRepository, UserRepository userRepository, BloodExamRepository bloodExamRepository) {
        this.employeeRepository = employeeRepository;
        this.userRepository = userRepository;
        this.bloodExamRepository = bloodExamRepository;
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

        BloodExam be1 = new BloodExam();
        be1.setRbc(50);
        be1.setWbc(120);
        be1.setHemoglobin(18);
        be1.setPlatelets(4.5f);
        be1.setPlatelets(34);
        Date d = new Date();
        be1.setDateExamination(new GregorianCalendar().getTime());
        be1.setEmployee(e1);
        bloodExamRepository.save(be1);

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

        BloodExam be2 = new BloodExam();
        be2.setRbc(22);
        be2.setWbc(120);
        be2.setHemoglobin(12);
        be2.setPlatelets(2.8f);
        be2.setPlatelets(72);
        be2.setDateExamination(new GregorianCalendar().getTime());
        be2.setEmployee(e2);
        bloodExamRepository.save(be2);


        System.out.println(e2);


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


        BloodExam be3 = new BloodExam();
        be3.setRbc(40);
        be3.setWbc(110);
        be3.setHemoglobin(15);
        be3.setPlatelets(3.7f);
        be3.setPlatelets(74);
        be3.setDateExamination(new GregorianCalendar().getTime());
        be3.setEmployee(e3);
        bloodExamRepository.save(be3);

        System.out.println(e3);


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

        BloodExam be4 = new BloodExam();
        be4.setRbc(24);
        be4.setWbc(140);
        be4.setHemoglobin(10);
        be4.setPlatelets(6.2f);
        be4.setPlatelets(80);
        be4.setDateExamination(new GregorianCalendar().getTime());
        be4.setEmployee(e4);
        bloodExamRepository.save(be4);
        System.out.println(e4);

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

        BloodExam be5 = new BloodExam();
        be5.setRbc(14);
        be5.setWbc(100);
        be5.setHemoglobin(16);
        be5.setPlatelets(5.0f);
        be5.setPlatelets(24);
        be5.setDateExamination(new GregorianCalendar().getTime());
        be5.setEmployee(e5);
        bloodExamRepository.save(be5);

        System.out.println(e5);


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


        BloodExam be6 = new BloodExam();
        be6.setRbc(20);
        be6.setWbc(132);
        be6.setHemoglobin(40);
        be6.setPlatelets(4.4f);
        be6.setPlatelets(62);
        be6.setDateExamination(new GregorianCalendar().getTime());
        be6.setEmployee(e6);
        bloodExamRepository.save(be6);

        System.out.println(e6);



        BloodExam be7 = new BloodExam();
        be7.setRbc(42);
        be7.setWbc(93);
        be7.setHemoglobin(13);
        be7.setPlatelets(5.2f);
        be7.setPlatelets(18);
        be7.setDateExamination(new GregorianCalendar().getTime());
        be7.setEmployee(e1);
        bloodExamRepository.save(be7);



 */

    }
}