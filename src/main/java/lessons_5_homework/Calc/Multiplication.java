package lessons_5_homework.Calc;

public class Multiplication implements Operation{
    public double execute(double a, double b) {
        double d=a* b;
        System.out.println("Умножение равно = "+d);
        return d;
    }
}
