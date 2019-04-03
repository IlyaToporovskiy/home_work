package lessons_11_homework;

import java.io.*;
import java.util.Arrays;

//Задача 3
//a) Зашифровать/ дешифровать файл паролем (XOR) (посмотреть в интернете)
//b) Зашифровать/ дешифровать файл другим файлом
public class Task_3 {
  public static void main(String[] args) {

    String file = "src/task2.txt";
    try {
      encodeFile(new File(file),"1234");
    } catch (IOException e) {
      e.printStackTrace();
    }


  }

  public static void encodeFile(File file,String pass) throws IOException {
    try (
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream1 =new FileOutputStream(file,true);
            FileOutputStream fileOutputStream2 =new FileOutputStream(file,false);
            ByteArrayOutputStream byteArrayOutputStream =new ByteArrayOutputStream();
    ) {
      System.out.println(fileInputStream.available());
      byte[] buf=new byte[10];
      int len;
      while ((len = fileInputStream.read(buf)) > 0) {
        System.out.println(Arrays.toString(buf));
        byteArrayOutputStream.write(buf, 0, len);
      }
      System.out.println(Arrays.toString(byteArrayOutputStream.toByteArray()));

      byte[] buf2=Arrays.copyOf(byteArrayOutputStream.toByteArray(),byteArrayOutputStream.toByteArray().length);
      System.out.println(Arrays.toString(buf2));

      byte[] key=pass.getBytes();
      byte[] res = new byte[buf2.length];
      for (int i = 0; i < buf2.length; i++) {
        res[i] = (byte) (buf2[i] ^ key[i % key.length]);
      }
      System.out.println(Arrays.toString(res));

      fileOutputStream2.write(null);
      fileOutputStream1.write(res);


    }

  }
}


/*  public static byte[] encode(String pText, String pKey) {
    byte[] txt = pText.getBytes();
    byte[] key = pKey.getBytes();
    byte[] res = new byte[pText.length()];

    for (int i = 0; i < txt.length; i++) {
      res[i] = (byte) (txt[i] ^ key[i % key.length]);
    }

    return res;
  }*/


 /* public static String decode(byte[] pText, String pKey) {
    byte[] res = new byte[pText.length];
    byte[] key = pKey.getBytes();

    for (int i = 0; i < pText.length; i++) {
      res[i] = (byte) (pText[i] ^ key[i % key.length]);
    }

    return new String(res);
  }*/
