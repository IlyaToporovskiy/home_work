package lessons_5_homework.Calc.Zadacha_2;

public class Multiplication implements Operation{
    private  double a;
    private  double b;

    public Multiplication(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double execute() {
        return a*b;
    }
}
