package lessons_3_homework;

import java.util.Scanner;

public class Zadacha_5 {
  public static void main(String[] args) {
    //Выполнения циклов

    Scanner sc1 = new Scanner(System.in);
    System.out.println("Введите строку : ");
    String a = sc1.nextLine();

    System.out.println("Введите подстроку для замены : ");
    String b = sc1.nextLine();

    System.out.println("Введите чем хотите заменить подстроку ");
    String c = sc1.nextLine();
    String d =a.replaceAll(b,c);
    System.out.println(d);

    String s = d;
    String s2 = "";
    for (int i = 0; i < s.length(); i++) {
      Boolean found = false;
      for (int j = 0; j < s2.length(); j++) {
        if (s.charAt(i) == s2.charAt(j)) {
          found = true;
          break; //
        }
      }
      if (found == false) {
        s2 = s2.concat(String.valueOf(s.charAt(i)));
      }
    }
    System.out.println(s2.replaceAll(" ",""));




  }
}
