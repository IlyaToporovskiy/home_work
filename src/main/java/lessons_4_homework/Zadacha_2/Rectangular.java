package lessons_4_homework.Zadacha_2;

public class Rectangular {
    private double a;
    private double b;

    public Rectangular() {
    }

    public Rectangular(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double sRectangular() {
        double s = this.a * this.b;
        return s;
    }
    public double pRectangular() {
        double p = 2*this.a +2 * this.b;
        return p;
    }

    @Override
    public String toString() {
        return "Rectangular{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}
