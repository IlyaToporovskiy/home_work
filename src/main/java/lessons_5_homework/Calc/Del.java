package lessons_5_homework.Calc;

public class Del implements Operation{
    public double execute(double a, double b) {
        double d=a / b;
        System.out.println("Del равнo = "+d);
        return d;
    }
}
