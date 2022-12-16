package BeansLearnerLab.Beans.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Teacher teacher = instructors.findById((int) id);
        teacher.lecture(students.getArray(), numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> hm = new HashMap<>();
        for (Student s : students) {
            hm.put(s, s.getTotalStudyTime());
        }
        return hm;
    }
}
