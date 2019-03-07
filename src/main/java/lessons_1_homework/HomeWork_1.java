package lessons_1_homework;

public class HomeWork_1 {
  public static void main(String[] args) {

    /**Задача 1
     * @author Ilya Elizarov
     * */
    System.out.println("Задача 1 \n");
    double height,width,length,s,v;
    String a;
    height = 10.1;
    width = 5.6;
    length = 20.3;
    s = 2*((height*width)+(height*length)+(width*length));
    System.out.println("площадь поверхностни прямоугольного параллелепипеда = " + s + " см2");
    v = height*width*length;
    System.out.println("объем прямоугольного параллелепипеда = " + v+" см3");
    a =(width>height)?"ширина больше она равна " + width +" см":"высота больше она равна "+ height+ " см";
    System.out.println(a);

    /**Задача 2
     * @author Ilya Elizarov
     * */


  }
}
