package BeansLearnerLab.Beans.interfaces;

import java.util.Collection;

public class Instructor extends Person implements Teacher {
    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, Double numberOfHours) {
        Double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner l : learners) {
            l.learn(numberOfHoursPerLearner);
        }
    }
}
