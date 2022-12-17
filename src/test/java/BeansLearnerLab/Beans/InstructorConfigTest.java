package BeansLearnerLab.Beans;

import BeansLearnerLab.Beans.interfaces.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InstructorConfigTest {
    @Autowired
    InstructorsConfig instructorsConfig;

    @Test
    @Qualifier("instructors")
    public void testStudentConfig() {
        Instructors instructors = instructorsConfig.zcwInstructors();

        List<Instructor> li = new ArrayList<>();
        for (Instructor p : instructors) {
            li.add(p);
        }

        Assert.assertEquals("Kris", li.get(0).getName());
    }
}