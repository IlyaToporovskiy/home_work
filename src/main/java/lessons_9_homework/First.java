package lessons_9_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Написать программу со следующим функционалом:
//Считывание максимум 5 строк с клавиатуры,
//занесение строк в список,
//поиск самой короткой строки,
//вывод самой короткой строки на экран по запросу пользователя (команда в консоле /short string)
//Если одинаково коротких строк несколько, выводить каждую с новой строки.
public class First {
    List<String> str;
    public static void main(String[] args) {
    First first=new First();
    first.getData(5);
    first.findShortList();
    }

    public List<String> getData(int length){
        str =new ArrayList<>(length);
        Scanner sc=new Scanner(System.in);
        System.out.println("Введи строки");

        for(int i=0; i<5;i++){
            str.add(sc.nextLine());
        }
        System.out.println("Список строк "+str);

        return str;
    }


    public void findShortList(){
        String s=str.get(0);


        for(int i=0;i<5;i++){
            if(str.get(i).length()<=s.length()){
                s=str.get(i);
            }
        }
        StringBuilder stroki=new StringBuilder();

        for(int i=0;i<5;i++){
            if(str.get(i).length()==s.length()){
                stroki.append(str.get(i) +"\n");
            }
        }
        System.out.println(stroki);
    }

    public List<String> getStr() {
        return str;
    }

    public void setStr(List<String> str) {
        this.str = str;
    }
}
