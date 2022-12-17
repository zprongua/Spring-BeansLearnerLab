package BeansLearnerLab.Beans.interfaces;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {

    @Bean("instructors")
    @Primary
    public Instructors zcwInstructors() {
        return Instructors.getInstance();
    }

    @Bean("tcUsaInstructors")
    public Instructors tcUsaInstructors() {
        return Instructors.getInstance();
    }

    @Bean("tcUkInstructors")
    public Instructors tcUkInstructors() {
        return Instructors.getInstance();
    }
}
