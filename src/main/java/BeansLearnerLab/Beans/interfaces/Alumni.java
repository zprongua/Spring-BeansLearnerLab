package BeansLearnerLab.Beans.interfaces;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

public class Alumni {
    @Autowired
    Students students = new StudentConfig().previousStudents();

    @Autowired
    Instructors instructors = new InstructorsConfig().zcwInstructors();

    @PostConstruct
    public void executeBootCamp() {
        Instructor t1 = instructors.personList.get(0);
        Instructor t2 = instructors.personList.get(1);
        Instructor t3 = instructors.personList.get(2);
        t1.lecture(students.getArray(), 4000.0);
        t2.lecture(students.getArray(), 4000.0);
        t3.lecture(students.getArray(), 4000.0);
    }

    public Instructors getInts() {
        return instructors;
    }

    public Students getStu() {
        return students;
    }
}
