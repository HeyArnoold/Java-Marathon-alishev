package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String course;

    public Teacher(String name, String course) {
        this.name = name;
        this.course = course;
    }
    public void evaluate (Student student){
        int min = 2;
        int max = 5;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1) + min;

        String score = null;

        if (i == 2) score = "не удолитворительно";
        if (i == 3) score = "удолитворительно";
        if (i == 4) score = "хорошо";
        if (i == 5) score = "отлично";

        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + course + " на оценку " + score);
    }
}
