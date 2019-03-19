package lessons_5_homework.Calc;

public class Minus implements Operation {
    public double execute(double a, double b) {
        double d=a - b;
        System.out.println("Разница равна = "+d);
        return d;
    }
}
