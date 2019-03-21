package lessons_5_homework.Zadacha_1;

public class List implements ListInterFace{
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

    public void addElementFront(Object obj) {
        Element t = new Element();
        t.setVal(obj);
        if (start == null) { // если список у нас
            setStart(t);
            setEnd(t);
        } else if (start != null) {
            t.setNext(null);
            t.setPrev(getEnd());
            setEnd(t);
            t.getPrev().setNext(t);
        }
    }

    public void removeItem(Object obj) {
        if (start == null) {
            return;
        }else if (start.getVal() == obj){
            setStart(start.getNext());
            start.setPrev(null);
        }
        Element t=start;
        boolean dataHere;
        while (t.getNext()!=null){
            if(t.getVal()==obj){
                //удаляем элемент
                t.getNext().setPrev(t.getPrev());
                t.getPrev().setNext(t.getNext());
                dataHere=true;
            }
            t=t.getNext();
        }
        if(dataHere=true){
            System.out.println("Удалили число");
        }
    }

    public void show() {
        Element t = start;
        while (t!=null){
            System.out.print(t.getVal()+ " ");
            t=t.getNext();
        }
    }

    public void removeFront() {
        if (start != null) { // если список у нас
            setEnd(end.getPrev());
            end.setNext(null);
        } else if (start == null) {
            return;
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
