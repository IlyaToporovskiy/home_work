package lessons_4_homework.zadacha_1;

public class List {
    private ListElement start; //ссылка на начальный элемент
    private ListElement end; //ссылка на конец элемент


    public void addElementBack(int data) {
        ListElement t = new ListElement();
        t.setVal(data);
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

    public void addElementForward(int data) {
        ListElement t = new ListElement();
        t.setVal(data);
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


    public void removeBack() {
        if (start != null) { // если список у нас
            setStart(start.getNext());
            start.setPrev(null);
       } else if (start == null) {
                return;
        }
    }

    public void removeItemAll(int data){
         if (start == null) {
            return;
        }else if (start.getVal() == data){
             setStart(start.getNext());
             start.setPrev(null);
         }
         ListElement t=start;
         boolean dataHere;
         while (t.getNext()!=null){
             if(t.getVal()==data){
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




    public void show(){
        ListElement t = start;
        while (t!=null){
            System.out.print(t.getVal()+ " ");
            t=t.getNext();
        }
    }


    public ListElement getStart() {
        return start;
    }

    public void setStart(ListElement start) {
        this.start = start;
    }

    public ListElement getEnd() {
        return end;
    }

    public void setEnd(ListElement end) {
        this.end = end;
    }
}