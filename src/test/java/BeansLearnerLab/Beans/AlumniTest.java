package BeansLearnerLab.Beans;

import BeansLearnerLab.Beans.interfaces.Alumni;
import BeansLearnerLab.Beans.interfaces.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlumniTest {

    @Autowired
    Alumni alumni;
    @Test
    public void testAlumni() {

        alumni.executeBootCamp();

        int numberOfInstructors = alumni.getInts().count();
        int numberOfStudents = alumni.getStu().count();
        double numberOfHoursToTeachEachStudent = 1200;
        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
        double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;

        Student s = alumni.getStu().findById(5);
        Assert.assertEquals(numberOfHoursToTeachEachStudent, s.getTotalStudyTime(), 0.001);
        Assert.assertEquals(4000, numberOfHoursPerInstructor, 0.001);
    }
}
