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
    boolean isActive ;
    String dish;

    public String makeZakaz(String dish){
        System.out.println(dish);
        isActive=true;
        this.dish=dish;
        return dish;
    }
    public static void main(String[] args) {
        Client client =new Client();
        client.makeZakaz("блюдо1");


        Officiant officiantThread =new Officiant(client.dish);
        officiantThread.run();

    }
}

class Officiant implements Runnable{
    boolean clientIsActive;
    String zakaz;
    Client client;

    public Officiant() {
    }

    public Officiant(String zakaz) {
        this.clientIsActive = true;
        this.zakaz = zakaz;
    }



    @Override
    public void run() {

        while (clientIsActive==true){
                sayCook();
                clientIsActive=false;
                System.out.println(Thread.currentThread().getState());
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getState());

    }

    void sayCook(){
        System.out.println("начинай готовить " + zakaz);
    }
}

class Cook implements Runnable{
    @Override
    public void run() {
        System.out.println("готовлю блюдо");
//        Thread.sleep(5000);
        System.out.println("Блюдо готово");
    }
}