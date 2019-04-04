package lessons_9_homework;

//Написать программу, которая должна:
//Считывать с клавиатуры 10 слов в список строк.
//Определять, является ли список упорядоченным по возрастанию длины строки.
//В случае отрицательного ответа выводить на экран номер первого элемента, нарушающего такую упорядоченность.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Five {
  public static void main(String[] args) {
    System.out.println(getArray(3));
  }

  public static List<String> getArray(int length) {
    System.out.println("Введите строки ");
    List<String> str = new ArrayList<>(length);
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < length; i++) {
      str.add(sc.nextLine());
    }
    return str;
  }

  //Определять, является ли список упорядоченным по возрастанию длины строки.
//В случае отрицательного ответа выводить на экран номер первого элемента, нарушающего такую упорядоченность.
  public static String checkSortedList(List<String> list) {
    boolean isSort;
    for (int i = 0; i < list.size() - 1; i++) {

      if (list.get(i + 1).length() - list.get(i).length() >= 0) {
        isSort = true;
      }

    }
    String s = new String("ответ");
    return s;
  }
}
