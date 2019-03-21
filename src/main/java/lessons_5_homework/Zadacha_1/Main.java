package lessons_5_homework.Zadacha_1;

public class Main {
    public static void main(String[] args) {
//        Stack stack=new Stack();
//        stack.addElementBack(45);
//        stack.addElementBack(34);
//        stack.addElementBack("dasds");
//
//        stack.removeBack();
//        stack.show();
//        System.out.println("");
//
//
//        Queue queue=new Queue();
//        queue.addElementBack(45);
//        queue.addElementBack(34);
//        queue.addElementBack("dasds");
//        queue.show();
//        System.out.println("");
//        queue.removeFront();
//
//        queue.show();



        List list=new List();
        list.addElementBack("1");
        list.addElementBack("2");
        list.addElementFront("3");
        list.addElementFront("4");
//        list.removeBack();
//        list.removeFront();
        list.addElementFront("6");
        list.addElementFront("6");
        list.removeItem("6");
        list.show();

    }
}
