package BeansLearnerLab.Beans.interfaces;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alumni {
    @Autowired
    @Qualifier("students")
    Students students;

    @Autowired
    @Qualifier("instructors")
    Instructors instructors;

    @PostConstruct
    public void executeBootCamp() {
        Instructor t1 = instructors.personList.get(0);
        Instructor t2 = instructors.personList.get(1);
        Instructor t3 = instructors.personList.get(2);
        t1.lecture(students.getArray(), 2000.0);
        t2.lecture(students.getArray(), 2000.0);
        t3.lecture(students.getArray(), 2000.0);
    }

    public Instructors getInts() {
        return instructors;
    }

    public Students getStu() {
        return students;
    }
}
