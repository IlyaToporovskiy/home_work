package lesson_3;

import java.util.Arrays;

public class ArraysLesson {
    public static void main(String[] args) {
//        java.util.Arrays  класс для работы с массивами
        //объявление массива

        int[] arr; // более предпочтительный
        int arr2[];

        // создание массива
        arr = new int[5]; //[5] указали размер массива , по умолчанию равен 0
        System.out.println(Arrays.toString(arr));

        char[] chars = new char[3];
        System.out.println(Arrays.toString(chars));

        // null для [] из объектов

        // размер массива изменить нельзя!!!

        int arrLength = arr.length; //arr =new int[5] [0, 0, 0, 0, 0]
        System.out.println("Длина массива arr " + arrLength);

        int[] arr3 = {2, 3, 56, 89, 7};
        arr3 = new int[]{2, 6};

        // обращение к элементу массива
        System.out.println(arr3[1]);
//        System.out.println(arr3[88]);  нельзя обратиться к элементу несуществующего элемента


        int[] arr4 = new int[4];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] += 4;
        }
        System.out.println(Arrays.toString(arr4));


        //копирование массива
        int[] arr5 = {2, 7, 1, 90};
//        int [] arr6 = arr5; //ссылка на один и тот же массив

        // копирование массивов
        int [] arr6 = arr5.clone(); // полная копия массива, два массива у каждого своя ссылка


        int [] arr7 = new int[10];
        System.arraycopy(arr5,1,arr7,2,2);
        System.out.println(Arrays.toString(arr7));

        int [] arr8 = {2,7,1,90};
        int [] copyArray = Arrays.copyOf(arr8,12);
        System.out.println(Arrays.toString(copyArray)); // копирование из библиотеке Arrays


        //перебор массива
        for (int i =0;i<arr8.length;i++){   // есть возможность взаимодействовать с элементами массива
            System.out.println(arr8[i]);
            arr8[i] +=3;
        }
        System.out.println(Arrays.toString(arr8));


        //int[] arr8 = {2, 7, 1, 90};
        for (int num: arr8){   //foreach    тип_переменной имяПеременной
            System.out.println(num); //2  // нельзя изменить массив
            num+=3;  //5  // на второй операции перезатреться 7
        }
        System.out.println(Arrays.toString(arr8));


        // сравнение массивов
        int[] arr9 = new int[5];
        int[] arr10 = new int[5];
        System.out.println(arr9==arr10);  //false проверка ссылки
        System.out.println(arr9.equals(arr10)); // false нельзя сравнивать массивы

        System.out.println(Arrays.equals(arr9,arr10)); // сравнение массивов библиотека Arrays

        Arrays.fill(arr9,23); //наполняет массив значениями


       //поиск в массиве
        int[] arr11 = {2, 4, 6, 1,89};
        System.out.println(Arrays.binarySearch(arr11,4));// вернет номер
        System.out.println(Arrays.binarySearch(arr11,3)); // -(точка входа в массив)-1

        // определяем есть ли в массивеуказанный элемент
        String[] srtArr ={"qwe","asd","zxc"};
        System.out.println(Arrays.asList(srtArr).contains("qwe"));


        //Сортировка массивов
        Arrays.sort(arr11);
        System.out.println(Arrays.toString(arr11));







    }
}
