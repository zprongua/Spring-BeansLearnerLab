package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    KRIS(1, "Kris"),
    DOLIO(2, "Dolio"),
    KAREN(3, "Karen");

    Educator(long id, String name) {
        Instructor instructor = new Instructor(id, name);
        Instructors.getInstance().add(new Instructor(id, name));
    }

    @Override
    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, Double numberOfHours) {
        Double hours = numberOfHours/ learners.length;
        for (Learner l : learners) {
            l.learn(hours);
        }
        timeWorked += numberOfHours;
    }

    double timeWorked = 0.0;
}
