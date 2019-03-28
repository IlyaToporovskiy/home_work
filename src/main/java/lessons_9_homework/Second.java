package lessons_9_homework;

//Задача 2
//Написать программу со следующим функционалом:
//Считывание 20 чисел с клавиатуры,
//сохранение их в список,
//сортировка по трём другим спискам:
//число нацело делится на 3,
//нацело делится на 2 и
//все остальные.
//Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
//Метод printList() должен выводить на экран все элементы всех списков с новой строки.
//Метод printList(String listName) должен выводить на экран все элементы указанного списка

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Second {
    List<Integer> div2;
    List<Integer> div3;
    List<Integer> others;
    public static void main(String[] args) {
        Second second= new Second();
        second.run();
        second.printList();
    }
    private void run(){
        List<Integer> numList = getData(20);
        div2 = new ArrayList<>();
        div3 = new ArrayList<>();
        others = new ArrayList<>();
        for(int i :numList){
            if(i%2 == 0) div2.add(i);
            if(i%3 == 0) div3.add(i);
            if(i%2 != 0 && i%3 != 0) others.add(i);
        }
        printList();

    }
    private List<Integer> getData(int lenght){
        List<Integer> numList = new ArrayList<>(lenght);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        for(int i = 0; i < 20; i++){
            numList.add(sc.nextInt());
        }
        return numList;
    }
    private void printList(){
        System.out.println(div2.toString());
        System.out.println(div3.toString());
        System.out.println(others.toString());
    }
    private void printList(List<Integer> list){
        System.out.println(list);
    }
}
