package zadacha3;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.*;

//Порт. Корабли заходят в порт для разгрузки/загрузки.
// Работает несколько причалов. У одного причала может стоять один корабль.
// Корабль может загружаться у причала, разгружаться или выполнять оба действия.
public class Port {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        new Ship(semaphore, "корабль 1");
        new Ship(semaphore, "корабль 2");
        new Ship(semaphore, "корабль 3");
        new Ship(semaphore, "корабль 4");
    }
}

class Prichal {
    static volatile int count = 3; //количество причалов
    static volatile int writeCount = 1;
}

class Ship implements Runnable {
    Semaphore semaphore;
    String name;

    public Ship(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (Prichal.count == 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Начало работы потока " + name);
        try {
            System.out.println("Ожидание разрешения " + name);
            semaphore.acquire();//переключили семафор
            System.out.println("Разрешение получил");


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        unloading();
//        downloading();

        writeToFile();
        semaphore.release();
        System.out.println("потоку не нужен релиз");
    }

    public void unloading() { //разгрузка
        Prichal.count--;
        System.out.println("Идет разгрузка");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("разгрузка завершена " + name);
        Prichal.count++;

    }

    public void downloading() { //загрузка
        Prichal.count--;
        System.out.println("Идет загрузка");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("загрузка завершена " + name);
        Prichal.count++;

    }

    public void writeToFile() {
        while (Prichal.writeCount == 0){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try (
                FileOutputStream fileOutputStream =
                        new FileOutputStream("src/portLog.txt", true)
        ) {
            Prichal.writeCount=0;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(  " корабль  " + "\n");
            byte[] bytes = stringBuffer.toString().getBytes(); //массив приводит в байт
            fileOutputStream.write(bytes);
            Prichal.writeCount=1;
        } catch (IOException e) {
            e.printStackTrace();
        }


        // try (FileOutputStream outputStream =
        //                     new FileOutputStream(fileName, append)) {
        //            StringBuilder sb = new StringBuilder();
        //            for (int i = 0; i < 6; i++) {
        //                sb.append("line.").append(i).append("\n");
        //            }
        //
        //            byte[] bytes = sb.toString().getBytes(charset); //массив приводит в байт
        //
        //            outputStream.write(bytes);
    }

}