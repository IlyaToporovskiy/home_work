package lessons_4_homework.Zadacha_2;

public class Triangle {
    private double a;
    private double b;
    private double d;

    public Triangle() {
    }

    public Triangle(double a, double b, double d) {
        this.a = a;
        this.b = b;
        this.d = d;
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

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double sTriangle() {
        double p = (a + b + d) / 2;
        double f = p * (p - a) * (p - b) * (p - d);
        double g = Math.sqrt(f);
        return g;
    }

    public double pTriangle() {
        double p = (a + b + d) / 2;
        return p;
    }

    public void testTriangle() {
        if (a + b > d & a + d > b & b + d > a) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + d +
                '}';
    }
}
