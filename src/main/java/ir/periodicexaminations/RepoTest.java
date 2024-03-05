package ir.periodicexaminations;


import ir.periodicexaminations.model.implementRepositories.EmployeeRepository;
import ir.periodicexaminations.model.implementRepositories.examRepositories.BloodExamRepository;
import ir.periodicexaminations.model.implementRepositories.examRepositories.ExamFileRepository;
import ir.periodicexaminations.model.implementRepositories.UserRepository;
import ir.periodicexaminations.model.implementRepositories.examRepositories.HearingExamRepository;
import ir.periodicexaminations.model.implementRepositories.examRepositories.VisionExamRepository;
import ir.periodicexaminations.model.repository.entities.Employee;
import ir.periodicexaminations.model.repository.entities.Exam.BloodExam;
import ir.periodicexaminations.model.repository.entities.Exam.ExamFile;
import ir.periodicexaminations.model.repository.entities.Exam.VisionExam;
import ir.periodicexaminations.model.repository.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Date;

@Component
public class RepoTest implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;
    private final ExamFileRepository examFileRepository;
    private final UserRepository userRepository;
    private final HearingExamRepository hearingExamRepository;
    private final VisionExamRepository visionExamRepository;
    private final BloodExamRepository bloodExamRepository;


    public RepoTest(EmployeeRepository employeeRepository, ExamFileRepository examFileRepository, UserRepository userRepository, HearingExamRepository hearingExamRepository, VisionExamRepository visionExamRepository, BloodExamRepository bloodExamRepository) {
        this.employeeRepository = employeeRepository;
        this.examFileRepository = examFileRepository;
        this.userRepository = userRepository;
        this.hearingExamRepository = hearingExamRepository;
        this.visionExamRepository = visionExamRepository;
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

        System.out.println(e1);


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

        System.out.println(e6);


        Exam be1 =(BloodExam) new ExamFactory().getKindOfExam(Exam.KindOfExam.BloodExam);


        be1.setCbc(50);
        be1.setWbc(120);
        be1.setHemoglobin(18);
        Date d = new Date();
        be1.setDateExamination(new Timestamp(d.getTime()));
        examRepository.save(be1);
        e1.getExams().add(be1);
        employeeRepository.save(e1);



        Exam be2 = new Exam();
        be2.setCbc(60);
        be2.setWbc(130);
        be2.setHemoglobin(12);
        be2.setDateExamination(new Timestamp(d.getTime()));
        examRepository.save(be2);
        e2.getExams().add(be2);
        employeeRepository.save(e2);

        Exam be3 = new Exam();
        be3.setCbc(40);
        be3.setWbc(100);
        be3.setHemoglobin(7);
        be3.setDateExamination(new Timestamp(d.getTime()));
        examRepository.save(be3);
        e3.getExams().add(be3);
        employeeRepository.save(e3);


        Exam be4 = new Exam();
        be4.setCbc(60);
        be4.setWbc(105);
        be4.setHemoglobin(14);
        be4.setDateExamination(new Timestamp(d.getTime()));
        examRepository.save(be4);
        e4.getExams().add(be4);
        employeeRepository.save(e4);

        Exam be5 = new Exam();
        be5.setCbc(30);
        be5.setWbc(203);
        be5.setHemoglobin(17);
        be5.setDateExamination(new Timestamp(d.getTime()));
        examRepository.save(be5);
        e5.getExams().add(be5);
        employeeRepository.save(e5);


        Exam be6 = new Exam();
        be6.setCbc(22);
        be6.setWbc(216);
        be6.setHemoglobin(15);
        d= new Date(2024, Calendar.MARCH, 3);
        be6.setDateExamination(new Timestamp(d.getTime()));
        examRepository.save(be6);
        e1.getExams().add(be6);
        employeeRepository.save(e1);


        ExamFactory examFactory=new ExamFactory().getKindOfExam(Exam.KindOfExam.BloodExam).
        Exam be7 = new Exam(Exam.KindOfExam.HearingExam,new Timestamp(d.getTime()),8.0f,7.8f);
        examRepository.save(be7);
        e1.getExams().add(be7);
        employeeRepository.save(e1);

*/
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

        System.out.println(e1);
        ExamFile examFile = new ExamFile();
        examFile.setYear(1402);
        examFileRepository.save(examFile);

        BloodExam be1 = new BloodExam();
        be1.setCbc(50);
        be1.setWbc(120);
        be1.setHemoglobin(18);
        Date d = new Date();
        be1.setDateExamination( new Timestamp (d.getTime()));
        bloodExamRepository.save(be1);
        examFile.getBloodExams().add(be1);

        VisionExam ve1 = new VisionExam();
        ve1.setLeftVision(8.5f);
        ve1.setRightVision(7.2f);
        ve1.setDateExamination(new Timestamp (d.getTime()));
        visionExamRepository.save(ve1);

        examFile.getVisionExams().add(ve1);
        examFileRepository.save(examFile);

        e1.getExams().add(examFile);
        employeeRepository.save(e1);

        examFile.setEmployee(e1);
        be1.setBExamFileId(examFile);
        ve1.setVExamFileId(examFile);
        examFileRepository.save(examFile);
        bloodExamRepository.save(be1);
        visionExamRepository.save(ve1);


    }
}