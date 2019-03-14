package lessons_3_homework;

import java.util.Arrays;
import java.util.Random;

public class Zadacha_3 {
    public static void main(String[] args) {

        System.out.println("Задача 3 ");
        int num=15,count=0;
        Random random =new Random();
        int [] arr1 =new int[num];

        for (int i = 0; i<num;i++){
            arr1[i]=random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr1));
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]%2==0){
                count++;
            }
        }
        System.out.println("Количество четных = "+ count);
    }
}
