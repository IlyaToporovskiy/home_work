package lessons_11_homework;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Task_1 {
    public static void main(String[] args) {
        //Задача 1
        // Скопировать файл (имена файлов задаются с клавиатуры). Программа должна выводить количество скопированных байт
        System.out.println("Введите название файла (file1 , file2 или file3)");
//        Scanner sc =new Scanner(System.in);
//        String str=sc.nextLine().trim().toLowerCase();
//         str="src/"+str+".txt";
        String str = "src/file1.txt";

        try {
            readByteAndCount(new File(str));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static long readByteAndCount(File file) throws IOException {
        long sum = 0;
        try (FileInputStream inputStream = new FileInputStream(file)) {
            System.out.println(inputStream.available());

            while (inputStream.available() > 0) {
                int data = inputStream.read();
                sum += data;
//                System.out.println(" data ="+data);
            }

        }
        System.out.println(" Сумма байт =" + sum);
        return sum;
    }

//    public static void copyFile(String str){
//
//        Scanner sc = new Scanner(System.in);
//        StringBuilder nameFile =new StringBuilder();
//        String name=sc.nextLine();
//
//        nameFile.append(name.toLowerCase().trim());
//        System.out.println(nameFile.toString());
//
//        //// Create new file
//        try {
//            String content = "This is the content to write into create file";
//            String path = "src/file2.txt";
//            File file = new File(path);
//            // If file doesn't exists, then create it
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
