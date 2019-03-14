package lessons_3_homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadacha_4 {
    public static void main(String[] args) {
        System.out.println("Задача 4 ");

        int c = 1;
        int a = 0;

        while (c == 1) {
            System.out.println("Введите четное положительное число ");
            Scanner sc1 = new Scanner(System.in);
            int x = sc1.nextInt();
            if (x < 0) {
                System.out.println("Отрицательное число не может быть ");
                continue ;
            } else if (x % 2 == 0) {
                c = 2;
                a = x;
            }
        }

        int[] arr1 = new int[a];
        Random random = new Random();
        for (int i = 0; i < a; i++) {
            arr1[i] = random.nextInt(11) - 5;
        }
        System.out.println(Arrays.toString(arr1));

        int right = 0;
        int left = 0;
        for (int i = 0; i < a / 2; i++) {
            left += Math.abs(arr1[i]);
        }
        for (int i = a / 2; i < a; i++) {
            right += Math.abs(arr1[i]);
        }

        if (left == right) {
            System.out.println("Суммы по модулю равны = " + left);
        } else if (left > right) {
            System.out.println("Левая часть больше и = " + left);
        } else {
            System.out.println("Правая часть больше и = " + right);
        }

    }
}
