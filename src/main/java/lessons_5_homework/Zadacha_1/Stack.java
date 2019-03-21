package lessons_5_homework.Zadacha_1;

public class Stack implements StackInterface{
    private Element start; //ссылка на начальный элемент
    private Element end; //ссылка на конец элемент


    public void addElementBack(Object obj) {
        Element t = new Element();
        t.setVal(obj);
        if (start == null) { // если список у нас
            setStart(t);
            setEnd(t);
        } else if (start != null) {
            t.setNext(getStart());
            t.setPrev(null);
            setStart(t);
            t.getNext().setPrev(t);
        }
    }

    public void show() {
        Element t = start;
        while (t!=null){
            System.out.print(t.getVal()+ " ");
            t=t.getNext();
        }
    }

    public void removeBack() {
        if (start != null) { // если список у нас
            setStart(start.getNext());
            start.setPrev(null);
        } else if (start == null) {
            return;
        }
    }




    public Element getStart() {
        return start;
    }

    public void setStart(Element start) {
        this.start = start;
    }

    public Element getEnd() {
        return end;
    }

    public void setEnd(Element end) {
        this.end = end;
    }
}
