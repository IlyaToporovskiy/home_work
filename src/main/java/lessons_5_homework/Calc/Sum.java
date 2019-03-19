package lessons_5_homework.Calc;

public class Sum implements Operation {

    public double execute(double a, double b) {
        double d=a + b;
        System.out.println("Сумма равна = "+d);
        return d;
    }
}
