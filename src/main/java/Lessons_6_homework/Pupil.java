package Lessons_6_homework;

import java.util.Arrays;

public class Pupil {
    private int id;
    ExamResult [] examResult;

    public Pupil(int id) {
        this.id = id;
    }

    private class ExamResult {
        private String exam;
        private int marks;
        private boolean status;

        public ExamResult(String exam, int marks) {
            this.status = marks > 2;
            this.exam = exam;
            this.marks = marks;
        }

        @Override
        public String toString() {
            String s;
            if (status==false){
                s="Не сдал";
            }else {
                s="Сдал";
            }
            return " " + exam  +
                    " " + s  ;
        }
    }

    public void setExam(String[] exam,int []marks) {
        if(exam.length==marks.length){ // определили что длина массива предметов и оценок совпадает

            examResult =new ExamResult[exam.length]; //создаем массив
            for(int i=0;i<marks.length;i++){
                if(marks[i]<1|marks[i]>5){
                    System.out.println("не корректна оценка"); //
                    return;
                }else {
                    examResult[i] =new ExamResult(exam[i],marks[i]);
                }
            }
        }else {
            System.out.println(" Длина массива предметов и оценок не совпадает");
        }
    }

    @Override
    public String toString() {
        return
                "Студент =" + id  + Arrays.toString(examResult) +
                '}';
    }
}
