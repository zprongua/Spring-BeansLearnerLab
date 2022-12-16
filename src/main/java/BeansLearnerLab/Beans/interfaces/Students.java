package BeansLearnerLab.Beans.interfaces;

public final class Students extends People<Student> {
     private static final Students INSTANCE = new Students();

     private Students() {
         this.add(new Student(1, "Zach"));
         this.add(new Student(2, "Collin"));
         this.add(new Student(3, "Carolina"));
         this.add(new Student(4, "Eryk"));
         this.add(new Student(5, "Nina"));
         this.add(new Student(6, "Anna"));
         this.add(new Student(7, "Yangjie"));
         this.add(new Student(8, "Thien"));
         this.add(new Student(9, "Tarin"));
         this.add(new Student(10, "Dan"));
     }

    public static Students getInstance() {
         return INSTANCE;
    }

    public Student[] getArray() {
         return this.toArray(new Student[0]);
    }
}
