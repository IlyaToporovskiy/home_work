package lessons_1_homework;

import java.util.Scanner;

public class HomeWork_1 {
    public static void main(String[] args) {

        /*Задача 1
         * @author Ilya Elizarov
         * */
        System.out.println("\n Задача 1 \n");
        double height, width, length, s, v;
        String x;
        height = 10.1;
        width = 5.6;
        length = 20.3;
        s = 2 * ((height * width) + (height * length) + (width * length));
        System.out.println("площадь поверхностни прямоугольного параллелепипеда = " + s + " см2");
        v = height * width * length;
        System.out.println("объем прямоугольного параллелепипеда = " + v + " см3");
        x = (width > height) ? "ширина больше она равна " + width + " см" : "высота больше она равна " + height + " см";
        System.out.println(x);

        /*Задача 2
         * @author Ilya Elizarov
         * */
        System.out.println("\n Задача 2 \n");
        double sSum, /*общая площадь*/
                widthA, //сторона А
                widthB; //сторона Б
        sSum = 1000;
        widthA = 15;
        widthB = 25;
        double result = sSum % (widthA * widthB); // вычисляем остаток
        System.out.println("Остаток площади незанято = " + result + "м2");

        /*Задача 3
         * @author Ilya Elizarov
         * */
        System.out.println("\n Задача 3 \n");
        double sEllipse_1, sEllipse_2;
        sEllipse_1 = 15 * 100; // 15 дм2 приводим сразу к см2
        sEllipse_2 = 600; // см2

        System.out.println("Площадь овального кольца = " + (sEllipse_1 - sEllipse_2) + "см2");

        /*Задача 4
         * @author Ilya Elizarov
         * */
        System.out.println("\n Задача 4 \n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n:");
        double n = sc.nextDouble();
        System.out.println("Введите число m:");
        double m = sc.nextDouble();
        double y = 10;
        double res4 = (Math.abs(y - n) < Math.abs(y - m)) ? n : m;
        System.out.println("ближайшее число к 10 это число  " + res4);


        /*Задача 5
         * @author Ilya Elizarov
         * */
        System.out.println("\n Задача 5 \n");
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Введите число a:");
        double a = sc5.nextDouble();
        System.out.println("Введите число b:");
        double b = sc5.nextDouble();
        System.out.println("Введите число c:");
        double c = sc5.nextDouble();

        //вычисляем Дискриминант
        double discriminant = Math.pow(b,2) - 4*a*c;
        System.out.println("Дискриминант = " + discriminant);
        double answer_1,answer_2;
        answer_1 = ((-b) + Math.sqrt(discriminant))/2;
        answer_2 = ((-b) - Math.sqrt(discriminant))/2;
        if (discriminant>=0){
            if(answer_1==answer_2){
                System.out.println("Один корень " + answer_1);
            }
            else System.out.println("Корень 1 = " + answer_1 +"\n" + "Корень 2 = " + answer_2);


        }
        else System.out.println("Корней нет ");


        /*Задача 6
         * @author Ilya Elizarov
         * */

        System.out.println("\n Задача 6 \n");
        Scanner sc6 = new Scanner(System.in);
        System.out.println("Введите натуральное трехзначное число :");
        long nat = sc6.nextLong();
//        long a = 789L;
        if (nat<=0)
            System.out.println("Вы ввели не натуральное число ");
        long hundreds = nat / 100; //сотни
        long tens = (nat / 10) % 10; // десятки
        long units = nat % 10; // единицы
//        System.out.println(" Число сотен = " + hundreds);
//        System.out.println(" Число десятков = " + tens);
//        System.out.println(" число единиц = " + units);
        if(nat>0) {
            if (hundreds == tens && units == tens) {
                System.out.println("В числе " + nat + " наибольшая цифра = " + hundreds);
            }
            if (hundreds > tens && hundreds > units) {
                System.out.println("В числе " + nat + " наибольшая цифра = " + hundreds);
            }

            if (tens > hundreds && tens > units) {
                System.out.println("В числе " + nat + " наибольшая цифра = " + tens);
            }
            if (units > hundreds && units > tens)
                System.out.println("В числе " + nat + " наибольшая цифра = " + units);
        }

    }
}

