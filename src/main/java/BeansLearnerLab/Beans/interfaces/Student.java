package BeansLearnerLab.Beans.interfaces;

public class Student extends Person implements Learner {
    Double totalStudyTime = 0.0;

    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(Double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
