package multithread_homework.library_homework;

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
    static int count = 3; //количество причалов
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
        semaphore.release();
        System.out.println("потоку не нужен релиз");
    }

    public void unloading() { //разгрузка
        Prichal.count--;
        System.out.println("Идет разгрузка");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("разгрузка завершена " +name);
        Prichal.count++;

    }

    public void downloading() { //загрузка
        Prichal.count--;
        System.out.println("Идет загрузка");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("загрузка завершена " + name);
        Prichal.count++;

    }

}