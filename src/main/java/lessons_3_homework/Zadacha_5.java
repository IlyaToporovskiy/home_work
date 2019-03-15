package lessons_3_homework;

import java.util.Scanner;

public class Zadacha_5 {
  public static void main(String[] args) {
    //Выполнения циклов
    System.out.println("Введите строку : ");
    Scanner sc1 =new Scanner(System.in);
    String a = sc1.next();
    System.out.println("Введите подстроку для замены : ");
    Scanner sc2 =new Scanner(System.in);
    String b =sc2.next();
    System.out.println("Введите чем хотите заменить подстроку");
    Scanner sc3 =new Scanner(System.in);
    String c =sc2.next();

    String d;


    d=a.replace(b,c);
    System.out.println(d);
  }
}
