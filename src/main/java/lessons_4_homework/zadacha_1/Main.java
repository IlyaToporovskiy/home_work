package lessons_4_homework.zadacha_1;

public class Main {
    public static void main(String[] args) {


        List list_1 = new List();
        list_1.addElementBack(5);
        list_1.addElementBack(10);
        list_1.addElementBack(45);
        list_1.addElementBack(44);
        list_1.addElementBack(42);
        list_1.addElementBack(44);
        list_1.addElementBack(46);
//
        list_1.addElementForward(87);
        list_1.addElementForward(14);
        list_1.addElementForward(3);
        list_1.removeBack();
        list_1.removeItemAll(10);

        list_1.show();


//        list_1.addFront(1);

////
//        list_1.printList();
    }
}
