package Lessons_6_homework;

public class Main {
    public static void main(String[] args) {
        Pupil pupil = new Pupil(12345);
        String ex[] = {"Математика", "Биология"};
        int marks[] = {2, 5};

        pupil.setExam(ex, marks);
        System.out.println(pupil);
    }

}
