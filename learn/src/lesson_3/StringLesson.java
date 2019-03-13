package lesson_3;

import java.util.Arrays;

public class StringLesson {
    public static void main(String[] args) {

        // до jdk 9  символы хранились как массив char
        // после  9  строчки хранятся в формате  как массив байт
        String string ="Строка"; //пул строк
        String string2 ="Строка";//пул строк
        String string3 =new String("Строка");
        string3 =string3.intern(); // принудительно добавить объект в пул строк

        //сравнение строк
        System.out.println(string==string2); //ссылки на один и тот же объект памяти
        System.out.println(string==string3); //ссылки на один и тот же объект памяти


        String string4 =new String("Строка");

        //сравнение
        System.out.println(string.equals(string4));

        //сравнение без учета регистра
        System.out.println(string.equalsIgnoreCase(string4));

        System.out.println(string.startsWith("Ст"));
        System.out.println(string.endsWith("а"));

        //сортировка строк

        String[] strArr={string,string4,string2};
        Arrays.sort(strArr); // read how can!!!

        // конкатенация строк
        String string5 = "Str 1";
        String string6 = "Str 2";
        String string7 = string5+string6;

        String string8 = "Начало ";
        for(int i =0 ; i<3;i++){
            string8 +="итерация цикла "; //не рекомендуется использовать
        }
        System.out.println(string8);

//        StringBuilder stringBuilder; //Более быстрый  (потоко небезопасен) однопоточный
//        StringBuffer stringBuffer; //Более безопасный  (потоко безопасен) многопоточный

        string8 = "Начало ";
        StringBuilder stringBuilder =new StringBuilder(); // рекомендуймый вариант
        stringBuilder.append(string8);
        for(int i=0 ;i<3;i++){
            stringBuilder.append("итерация цикла ")
                    .append(i)
                    .append(" ");
        }
        string8=stringBuilder.toString();
        System.out.println(stringBuilder.toString());


        //методы работы со строками
        string8.substring(2);
        string8.substring(2,7);//указываем индекс
        System.out.println(string8.substring(2,7));
        string8.split(" ");//разбиваем строку на массив по регулярному выражению
        System.out.println(Arrays.toString(string8.split(" ")));

        System.out.println(string8.trim()); //удаляет пробелы??
        string8.replaceAll("","new str"); //удаляет пробелы




    }
}
