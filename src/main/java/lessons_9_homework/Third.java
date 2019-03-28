package lessons_9_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Задача 4
//Ввести с клавиатуры 5 слов в список строк.
//Удалить 3 - ий элемент списка, и вывести оставшиеся элементы в обратном порядке.
public class Third {
    List<String> str;
    public static void main(String[] args) {
      Third third=  new Third();
      third.getData().remove(2);
        System.out.println(third);
        third.reverseData();
    }


    public List<String> getData(){
        str =new ArrayList<>(5);
        Scanner sc=new Scanner(System.in);
        System.out.println("Введи строки");

        for(int i=0; i<5;i++){
            str.add(sc.nextLine());
        }
        System.out.println("Список строк "+str);

        return str;
    }
    public List<String> reverseData(){
        List<String> str2=new ArrayList<>(5);
        for(int i=0;i<str.size();i++){
            str2.add(i,str.get(str.size()-1-i));
        }
        System.out.println(str2);
        return str2;
    }

    @Override
    public String toString() {
        return "Third{" +
                "str=" + str +
                '}';
    }
}
