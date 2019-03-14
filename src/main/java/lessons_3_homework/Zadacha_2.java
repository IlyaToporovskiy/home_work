package lessons_3_homework;

import java.util.Arrays;

public class Zadacha_2 {
    public static void main(String[] args) {
        System.out.println("Задача 2 ");
        int[] arr1;
        int count = 0;
        for (int x = 0, d = 0; d < 99; x++) {
            d = x * 2 + 1;
            count++;
        }
        System.out.println("Длина массива = " + count);
        arr1 = new int[count];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i * 2 + 1;
        }
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[count - 1 - i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
