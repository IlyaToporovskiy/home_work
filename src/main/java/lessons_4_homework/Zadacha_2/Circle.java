package lessons_4_homework.Zadacha_2;

public class Circle {
    private double r;

    public Circle() {
    }
    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double sCircle(){//площадь окружности
        double s =Math.pow(this.r,2)*Math.PI;
        return s;
    }
    public double pCircle(){ //длина окружности
        double p =2*this.r*Math.PI;
        return p;
    }


    @Override
    public String toString() {
        return "Круг {" +
                "r=" + r +
                '}';
    }
}
