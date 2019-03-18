package lessons_4_homework.zadacha_1;

public class Main {
    public static void main(String[] args) {


        List list_1 = new List();
        list_1.addFront(1);
        list_1.addFront(2);
        list_1.addFront(3);
        list_1.addFront(34);


        list_1.addBack(4);
        list_1.addBack(5);
        list_1.addBack(6);
        list_1.addBack(79);
        list_1.addBack(84);


        list_1.delEl(5);
        list_1.printList();
    }
}
