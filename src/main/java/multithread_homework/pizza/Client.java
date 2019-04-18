package multithread_homework.pizza;
// Пиццерия
// Клиент (main), официант, повар
//        Каждый из потоков после выполнения операции засыпает.
//        официант и повар спят, пока не появится клиент
//        Клиент оставляет заказ, будит официанта, официант передает заказ
//        повару и будит его
//        Повар готовит заказ и возвращает блюдо.
//        Повар будит официанта, передает ему блюдо,
//        официант передает блюдо клиенту
public class Client {
    boolean isActive=false ;
    String dish = "блюдо1 ";
    public static void main(String[] args) {

    }
}

class Officiant implements Runnable{

    @Override
    public void run() {

    }
}

class Cook implements Runnable{
    @Override
    public void run() {

    }
}