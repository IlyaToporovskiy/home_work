package lesson_2;

import java.util.Scanner;

import static java.util.Locale.US;

public class SecondClass {
    public static void main(String[] args) {
        System.out.println("Вывод информации в консоль");
        Scanner in = new Scanner(System.in);// ввод информации в консоль
        in.useLocale(US) ; //!!! воспринимать цифры с запятой
        System.out.println("ВВедите код");
        double code = in.nextDouble();

        //если условие верно()true
        if (code == 123) {
            //выполниться код
            System.out.println("Вы вошли как администратор");
        } else if (code == 345) {
            System.out.println("Вы вошли как пользователь");
        } else {
            System.out.println(" Вы не вошли ");
        }

        int a = 5;
        int b = 7;

        if (a == 5) {
            System.out.println("Совпадение а = 5");
            if (b == 7) {
                System.out.println("Совпадение b = 7. вложенный if");
            }


        } else if (b == 7) {
            System.out.println("Совпадение b = 7");
        }

        //switch

        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите номер ");
        int num = in2.nextInt();
        String res;

        switch (num) {
            case 333333:  //ключевое слово
                res = "Большой приз";
                break; //оператор прерывания

            case 333334:  //объединение с 333335
            case 333335:  //
                res = "Средний приз";
                break;
            case 333336:
            case 333337:
            case 333338:
                res = "Малый приз";
                break;
            default:
                res = "нет приза";

        }
        System.out.println("Результат "+res);


        //циклы
        int messageCount =5;

        //while
        while (messageCount>0){
            System.out.println(" Сообщение "+ messageCount);
            messageCount--;
        }

        //do
        do{
            System.out.println("Первая итерация");  // do while выполниться хотя бы один раз
        }while (false);

//        for
//        for (инициализация ; проверка условия ; шаг){
//            тело цикла
//        }

        for (int i=1;i<11;i++){
            System.out.println("i = "+i);
        }

        for (int i=1;i<11;i++){
            if (i%2==0) continue;  // используется для продолжения итерации
            System.out.println("i = "+i);
        }


        for (int i=0;i<3;i++){
            System.out.println("Внешний цикл "+i);

            for (int j=0;j<15;j++){
                System.out.println("j = "+j);
                if(j==5)break;
            }
        }

        outer: for (int i = 0; i < 3; i++) {
            System.out.println("Внешний цикл ");

            for (int j = 0; j < 15; j++) {
                System.out.println("j = " + j);
                if (j == 5) break outer;
            }
        }

    }
}
