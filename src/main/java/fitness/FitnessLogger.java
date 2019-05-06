package fitness;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FitnessLogger {
    public static void writeLog(Human human, FitnessServiceEnumeration fitnessServiceEnumeration) throws IOException {
        StringBuilder strB = new StringBuilder();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        File file = new File("src/log.txt");

        strB.append(human.getSurname() + "  " + human.getName() + "  " + fitnessServiceEnumeration + "  "
                + LocalDate.now() + "  " + formatter.format(LocalTime.now()) + "  " + "\n");
        byte[] arr = strB.toString().getBytes();
        try (FileOutputStream out = new FileOutputStream(file, true)

        ) {
            out.write(arr);
        }

    }
}