package lessons_4_homework.Zadacha_2;

public class Figure {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setR(4);
        System.out.println("Площадь круга равна = " + circle1.sCircle() + "\n" + "Длина окружности равна = " + circle1.pCircle());

        Rectangular rect1 = new Rectangular(2, 3);
        System.out.println("Площадь прямоугольника равна = " +rect1.sRectangular()+"\n" +"Длина прямоугольника равна = "+rect1.pRectangular());

        Triangle triangle1 = new Triangle(2,78,79);
        triangle1.testTriangle();
        System.out.println("Площадь треугольника равна = " +triangle1.sTriangle()+ "\n" +"Длина треугольника равна = " +triangle1.pTriangle() );
    }
}
