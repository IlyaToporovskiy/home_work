package zadacha3;


//В ресторане быстрого обслуживания есть несколько касс.
// Посетители стоят в очереди в конкретную кассу,(можем указать конкретную кассу)
// но могут перейти в другую очередь при уменьшении или исчезновении там очереди


import java.util.concurrent.Semaphore;

public class Restoran {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);

    }
}

class Kassa{
    static int countKassa=3;
}

class Posetitel implements Runnable{

    @Override
    public void run() {

    }
}
