package BeansLearnerLab.Beans.interfaces;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Bean("currentCohort")
    @DependsOn({"instructors", "students"})
    public ZipCodeWilmington currentCohort() {
        return new ZipCodeWilmington();
    }

    @Bean("previousCohort")
    @DependsOn({"instructors", "previousStudents"})
    public ZipCodeWilmington previousCohort() {
        return new ZipCodeWilmington();
    }
}
