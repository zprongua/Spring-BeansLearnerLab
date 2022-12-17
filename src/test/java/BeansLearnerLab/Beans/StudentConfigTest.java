package BeansLearnerLab.Beans;

import BeansLearnerLab.Beans.interfaces.Student;
import BeansLearnerLab.Beans.interfaces.StudentConfig;
import BeansLearnerLab.Beans.interfaces.Students;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentConfigTest {
    @Autowired
    StudentConfig studentConfig;

    @Test
    @Qualifier("students")
    public void testStudentConfig() {
        Students students = studentConfig.currentStudents();

        Student[] sa = students.getArray();

        Assert.assertEquals("Zach", sa[0].getName());
    }

    @Test
    @Qualifier("previousStudents")
    public void testStudentConfig1() {
        Students students = studentConfig.previousStudents();

        Student[] sa = students.getArray();

        Assert.assertEquals("Zach", sa[0].getName());
    }
}
