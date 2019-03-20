package lessons_5_homework.Calc.Zadacha_2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    double firstNum, secondNum, result;
    String oper;

    Scanner input = new Scanner(System.in);
    System.out.println("Введите число 1 :");
    firstNum = input.nextDouble();

    System.out.println("Введите операцию :");
    oper = input.next();

    System.out.println("Введите число 2 :");
    secondNum = input.nextDouble();



    outher:
    switch (oper) {
      case "+":
        result = new Sum(firstNum, secondNum).execute();
        System.out.println("Результат  "+oper + "  " + firstNum + " на " + secondNum+" = " + result);
        break;
      case "-":
        result = new Minus(firstNum, secondNum).execute();
        System.out.println("Результат  "+oper + "  " + firstNum + " на " + secondNum+" = " + result);
        break;
      case "*":
        result = new Multiplication(firstNum, secondNum).execute();
        System.out.println("Результат  "+oper + "  " + firstNum + " на " + secondNum+" = " + result);
        break;
      case "/":
        result = new Del(firstNum, secondNum).execute();
        System.out.println("Результат  "+oper + "  " + firstNum + " на " + secondNum+" = " + result);
        break outher;
    }


  }
}
