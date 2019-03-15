package lessons_3_homework;

public class Zadacha_6 {
  public static void main(String[] args) {
    String s= "дом 48, корпус 9, парадная 7, этаж 4";
    String d=s.replaceAll("[^0-9 $]","").replaceAll("  ",",");
    System.out.println(d);
  }
}
