package lessons_11_homework;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

//Задача 2
//Разбить/склеить файл. (имена файлов и размер куска задаются с клавиатуры)
public class Task_2 {
  public static void main(String[] args) {
    System.out.println("Введите что вы хотите сделать <разбить> или <склеить файл> ");
    Scanner sc = new Scanner(System.in);

//    System.out.println("Введите размер байт");

//         str="src/"+str+".txt";
//        String str = "src/file2.txt";
//        String str2 = "src/file1.txt";
//        String strNew = "src/fileNew.txt";
    String answer = sc.nextLine().trim().toLowerCase();
    switch (answer) {
      case ("разбить"):
        System.out.println("Введите имя файла");
        String str = sc.nextLine().trim().toLowerCase();
        str = "src/" + str + ".txt";
        System.out.println("Введите размер вырезки байт");
        int sizeByte=sc.nextInt();

        try {
          cutFile(new File(str), sizeByte, Charset.forName("UTF-8"));
        } catch (IOException e) {
          e.printStackTrace();
        }
        break;

      case ("склеить файл"):
        try {
          System.out.println("Введите имя файла 1");
          String str1 = sc.nextLine().trim().toLowerCase();
          str1 = "src/" + str1 + ".txt";

          System.out.println("Введите имя файла 2");
          String str2 = sc.nextLine().trim().toLowerCase();
          str2 = "src/" + str2 + ".txt";

          System.out.println("Введите имя файла куда хотите создать склейку файлов, " +
                  "\nесли его нет то он создасться ");
          String strNew = sc.nextLine().trim().toLowerCase();
          strNew = "src/" + strNew + ".txt";

          System.out.println("Введите размер вырезки байт для файла 1" );
          int sizeByteFile1=sc.nextInt();
          System.out.println("Введите размер вырезки байт для файла 2");
          int sizeByteFile2=sc.nextInt();

          System.out.println("Перезаписать информацию в файле или добавить ? \nвведите true или false" );
          String s=sc.next();
          boolean append;
          if(s=="true"){
            append=true;
          }


          cutFileAddSomeFile(new File(str1), new File(str2), new File(strNew), sizeByteFile1, sizeByteFile2, false, Charset.forName("UTF-8"));
        } catch (IOException e) {
          e.printStackTrace();
        }
        break;
    }
//    try {
//      cutFile(new File(str), 50, Charset.forName("UTF-8"));
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//    try {
//      cutFileAddSomeFile(new File(str), new File(str2), new File(strNew), 50, 50, false, Charset.forName("UTF-8"));
//    } catch (IOException e) {
//      e.printStackTrace();
//    }

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

  public static void cutFileAddSomeFile(File file1, File file2, File createFile, int sizeByte1, int sizeByte2, boolean append, Charset charset) throws IOException {
    try (
            FileInputStream inputStream1 = new FileInputStream(file1);
            ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
            FileInputStream inputStream2 = new FileInputStream(file2);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();

            FileOutputStream fileOutputStream = new FileOutputStream(createFile, append);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)) {
      byte[] buf1 = new byte[sizeByte1];//задаем массив байт
      byte[] buf2 = new byte[sizeByte1];//задаем массив байт
      inputStream1.read(buf1);
      inputStream2.read(buf2);
//            byteArrayOutputStream1.write(buf1, 0, sizeByte1);
//            byteArrayOutputStream1.write(buf2, 0, sizeByte2);
//            System.out.println(new String(byteArrayOutputStream1.toByteArray(), charset));
//            System.out.println(new String(byteArrayOutputStream2.toByteArray(), charset));
      if (!createFile.exists()) {
        createFile.createNewFile();
      }
      bufferedOutputStream.write(buf1);
      bufferedOutputStream.write(buf2);
      System.out.println("Файл склеин ");

    }
  }
}
