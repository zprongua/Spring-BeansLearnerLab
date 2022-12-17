package BeansLearnerLab.Beans.interfaces;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean(name = "students")
    public Students currentStudents() {
        return Students.getInstance();
    }

    @Bean(name = "previousStudents")
    public Students previousStudents() {
        return Students.getInstance();
    }
}