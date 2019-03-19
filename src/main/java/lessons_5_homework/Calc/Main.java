package lessons_5_homework.Calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double firstNum,secondNum;
        String oper;

        Scanner input =new Scanner(System.in);
        System.out.println("Введите число 1 :");
        firstNum=input.nextDouble();

        System.out.println("Введите операцию :");
        oper =input.next();
        System.out.println("Введите число 2 :");
        secondNum =input.nextDouble();
        System.out.println(firstNum + " "+oper+" "+ secondNum);





    }
}
