package multithread_homework.library_homework;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;

//Порт. Корабли заходят в порт для разгрузки/загрузки.
// Работает несколько причалов. У одного причала может стоять один корабль.
// Корабль может загружаться у причала, разгружаться или выполнять оба действия.
public class Port {

    public static void main(String[] args) {
        int numberPrichal =3;
        int numberShip =15;


        ArrayBlockingQueue<SynchronousQueue<Integer>> portPrichal =new ArrayBlockingQueue(numberPrichal);


        ExecutorService executorService = Executors.newFixedThreadPool(numberShip);
        executorService.execute(new Ship(portPrichal));
    }
}


class Ship implements Runnable{
    ArrayBlockingQueue<SynchronousQueue<Integer>> portPrichal;


    public Ship(ArrayBlockingQueue<SynchronousQueue<Integer>> portPrich) {
        this.portPrichal = portPrich;
    }

    @Override
    public void run() {
        while (portPrichal.isEmpty()){

        }
    }
}