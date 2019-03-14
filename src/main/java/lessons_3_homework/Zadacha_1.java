package lessons_3_homework;

import java.util.Arrays;

public class Zadacha_1 {
    public static void main(String[] args) {
        System.out.println("Задача 1 ");
        int count=0;
        for(int i=1,j=0 ; j<20;i++){
            j=2*i;
            count++;
        }

        System.out.println("Длина массива = "+count);
        int [] arr1 =new int [count];
        for(int i=0;i<(arr1.length);i++){
            arr1[i]=i*2+2;
        }
        System.out.println("Выводим элемент массива в строку через пробел "+
                Arrays.toString(arr1).replaceAll(", "," "));
        StringBuilder stringBuilder =new StringBuilder();
        for(int i=0 ;i<arr1.length;i++){
            stringBuilder.append(arr1[i]).append("\n");
        }
        System.out.print(stringBuilder);

    }
}
