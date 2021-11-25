package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Pol", "Biology");
        Student student = new Student("Mike");

        teacher.evaluate(student);
    }
}
