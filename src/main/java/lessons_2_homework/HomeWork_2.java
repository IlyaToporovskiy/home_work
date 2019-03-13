package lessons_2_homework;

import java.util.Scanner;

public class HomeWork_2 {
  public static void main(String[] args) {

    //// Задача 1

    System.out.println("Задача 1 \n");
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    Scanner sc3 = new Scanner(System.in);
    System.out.println("Введите число a :");
    int a = sc1.nextInt();
    System.out.println("Введите число b :");
    int b = sc2.nextInt();
    System.out.println("Введите число c :");
    int c = sc3.nextInt();

    if (a > b & a > c) {
      if (b > c) {
        System.out.println("Последовательность в порядке возрастания = " + c + " " + b + " " + a);
      } else {
        System.out.println("Последовательность в порядке возрастания = " + b + " " + c + " " + a);
      }
    } else if (b > a & b > c) {
      if (a > c) {
        System.out.println("Последовательность в порядке возрастания = " + c + " " + a + " " + b);
      } else {
        System.out.println("Последовательность в порядке возрастания = " + a + " " + c + " " + b);
      }
    } else if (c > a & c > b) {
      if (a > b) {
        System.out.println("Последовательность в порядке возрастания = " + b + " " + a + " " + c);
      } else {
        System.out.println("Последовательность в порядке возрастания = " + a + " " + b + " " + c);
      }
    } else {
      System.out.println("Введите правильно цифры !");
    }

    //// Задача 2
    System.out.println("\n Задача 2 \n");
    int num2 = 90;
    do {
      System.out.println("число = " + num2);
      num2 -= 5;
    } while (num2 >= 0);


//    // Задача 3
    System.out.println("\n Задача 3 \n");
    int num3 = 20;
    //Math.pow(b,2)
    for (int i3 = 1; i3 < 21; i3++) {
      System.out.println("Элемент последовательности " + i3 + " равен = " + (int) Math.pow(2, i3));
    }

//       //Задача 4  проверить является ли натуральное число простым
    System.out.println("\n Задача 4 ");
    Scanner sc4 = new Scanner(System.in);
    System.out.println("Введите число  :");
    int num4 = sc4.nextInt();
    boolean log = true;

    for (int i4 = 2; i4 < num4; i4++) {
      if (num4 % i4 == 0) {
        log = false;
        break;
      }
    }
    if (log) {
      System.out.println("Это простое число");
    } else {
      System.out.println("Это не  простое число");
    }


    //Задача 5
    System.out.println("\n Задача 5 ");
    int n = 11;
    int q = 1, w = 1;
    System.out.print(q + " " + w);
    int fib = 2, i5 = 2;
    while (i5 < n) {
      fib = q + w;
      q = w;
      w = fib;
      System.out.print(" " + fib);
      i5++;
    }

//        //Задача 6
    System.out.println("\n Задача 6 ");

    int x2 = 999999;

    int count = 0; //счетчик
    for (int i6 = 1; i6 <= x2; i6++) {
//            System.out.println(i); //выводим все цифры
      //Начинаем считать количество в десятках сотнях и т.д
      int part1 = i6 / 1000; //тысячи
      int findT = part1 / 100;
      int findTen = part1 / 10 % 10;
      int findUnit = part1 % 10;
      int part2 = i6 % 1000; //сотни
      int find2T = part2 / 100;
      int find2Ten = part2 / 10 % 10;
      int find2Unit = part2 % 10;
      // сумма левой и правой части цифр
      int sumLeftpart = findT + findTen + findUnit;
      int sumRightpart = find2T + find2Ten + find2Unit;
      // условие
      if (sumLeftpart == sumRightpart) {
        count++; //добавляем +1 если условие выполнено
      }
    }
    System.out.println("Количество совпадающих билетов  = " + count);

//        Задача 7
    System.out.println("\n Задача 7 ");
    int count7 = 0;
    for (int i7 = 0; i7 < 24; i7++) {
      if (i7 >= 0 & i7 <= 9) {
        System.out.println("i = 0" + i7);
      } else {
        System.out.println("i = " + i7);
      }

      for (int j7 = 0; j7 < 60; j7++) {
        if (j7 >= 0 & j7 <= 9) {
//                    System.out.println("j = 0"+j7);
        } else {
//                    System.out.println("j = "+j7);
        }

        int a7, b7, c7, d7;
        b7 = i7 / 10;
        a7 = i7 % 10;
        c7 = j7 / 10;
        d7 = j7 % 10;

        if (a7 == c7 & b7 == d7) {
          count7++;
          System.out.println("i = " + i7 + " j = " + j7);
          System.out.println("Счетчик +1 = " + count7);
          break;
        }
      }
    }
    System.out.println("Совпадений = " + count7);


//        Задача 8

    System.out.println("\n  Задача 8 Вариант 1");

    int i8, a8;
    for (i8 = 0, a8 = 00001; a8 <= 50000; a8++) {
      if (a8 % 10 == 2 ||
              a8 / 10 % 10 == 2 ||
              a8 / 100 % 10 == 2 ||
              a8 / 1000 % 10 == 2 ||
              a8 / 10000 % 10 == 2) {
        i8++;
      }
    }
    System.out.println(i8 + " Ошибочных табличек");
    System.out.println("\n  Задача 8 Вариант 2\n");
    int b0 = 0;

    for (int i0 = 2; i0 <= 50000; i0++) {
      String s = String.valueOf(i0);
      if (s.indexOf('2') != -1) {// если совпадений нет то выдает в ответ -1
        b0++;
      }
    }
    System.out.println("Ошибочных табличек - " + b0);

    //Задача 9

    System.out.println("\n  Задача 9");
    int count9 = 0;
    for (int i9 = 1; i9 < 100000; i9++) {
      int z9 = i9;
      while (z9 > 0) {
        if ((z9 % 10 == 4) || ((z9 % 10 == 3) && ((z9 / 10) % 10 == 1))) {
          count9++;
          break;
        }
        z9/=10;
      }
    }
    System.out.println("Всего номеров придётся исключить " + count9);


  }
}


