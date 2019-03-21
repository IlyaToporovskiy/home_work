package lessons_5_homework.Zadacha_2;

public class Del implements Operation {
    private double a;
    private double b;

    public Del(double a, double b) {
        this.a = a;
        this.b = b;
    }


    public double execute() {
        return a/b;
    }
}
