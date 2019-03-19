package lessons_4_homework.zadacha_1;

public class ListElement {
        private int val;
        private ListElement next;
        private ListElement prev;


    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListElement getNext() {
        return next;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }

    public ListElement getPrev() {
        return prev;
    }

    public void setPrev(ListElement prev) {
        this.prev = prev;
    }
}
