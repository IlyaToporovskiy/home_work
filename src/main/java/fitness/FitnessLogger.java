package fitness;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FitnessLogger{
 public static void writeLog(Human human,FitnessServiceEnumeration fitnessServiceEnumeration ) throws IOException {
   StringBuilder sb =new StringBuilder();
   DateTimeFormatter formatter =DateTimeFormatter.ofPattern("HH:mm:ss");

   File file =new File("src/log.txt");
   try(FileOutputStream fileOutputStream =new FileOutputStream(file,true);
   BufferedOutputStream buffer =new BufferedOutputStream(fileOutputStream)){
     sb.append(human.getSurname() + human.getName()+ LocalDate.now() +formatter.format(LocalDate.now()) + "\n");
     byte[] bytes =sb.toString().getBytes();
     buffer.write(bytes,0,bytes.length);
   }
 }
}