package lessons_5_homework.Zadacha_2;

public class Sum implements Operation {
    private double a ;
    private double b;

    public Sum(double a, double b) {
        this.a = a;
        this.b = b;
    }


    public double execute() {
        return a+b;
    }
}
