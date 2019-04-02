package lessons_11_homework;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;

//Задача 2
//Разбить/склеить файл. (имена файлов и размер куска задаются с клавиатуры)
public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Введите название файла (file1 , file2 или file3)");
//        Scanner sc =new Scanner(System.in);
//        String str=sc.nextLine().trim().toLowerCase();
//         str="src/"+str+".txt";
        String str = "src/file2.txt";
        String str2 = "src/file1.txt";
        String strNew = "src/fileNew.txt";

//        try {
//            cutFile(new File(str), 50, Charset.forName("UTF-8"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            cutFileAddSomeFile(new File(str),new File(str2),new File(strNew),50,50,true, Charset.forName("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void cutFile(File file, int sizeByte, Charset charset) throws IOException {
        try (
                FileInputStream inputStream = new FileInputStream(file);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
//            System.out.println("inputStream.available() =" + inputStream.available());
            byte[] buf = new byte[sizeByte];//задаем массив байт
            inputStream.read(buf);
            byteArrayOutputStream.write(buf, 0, sizeByte);

//            System.out.println(Arrays.toString(byteArrayOutputStream.toByteArray()));
            System.out.println(new String(byteArrayOutputStream.toByteArray(), charset));
        }
    }

    public static void cutFileAddSomeFile(File file1,File file2, File createFile, int sizeByte1,int sizeByte2,boolean append, Charset charset) throws IOException {
        try (
                FileInputStream inputStream1 = new FileInputStream(file1);
                ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
                FileInputStream inputStream2 = new FileInputStream(file2);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream()) {
            byte[] buf1 = new byte[sizeByte1];//задаем массив байт
            byte[] buf2 = new byte[sizeByte1];//задаем массив байт
            inputStream1.read(buf1);
            inputStream2.read(buf2);
            byteArrayOutputStream1.write(buf1, 0, sizeByte1);
            byteArrayOutputStream1.write(buf2, 0, sizeByte2);
            System.out.println(new String(byteArrayOutputStream1.toByteArray(), charset));
            System.out.println(new String(byteArrayOutputStream2.toByteArray(), charset));
            if (!createFile.exists()) {
                createFile.createNewFile();
            }

            try (FileOutputStream outputStream =
                         new FileOutputStream(createFile, append))
            {

//                for (int i = 0; i < sizeByte1+sizeByte2; i++){
//                    sb.append("line ").append(i).append("\n");
//                }
//
//                byte[] bytes = sb.toString().getBytes(charset);
//                outputStream.write(bytes);
            }

        }
    }
}
