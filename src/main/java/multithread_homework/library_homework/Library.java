package multithread_homework.library_homework;


import java.util.Random;
import java.util.Set;
import java.util.concurrent.*;

//Библиотека. Доступны для чтения несколько книг. Одинаковых книг в библиотеке нет.
// Некоторые выдаются на руки, некоторые только в читальный зал.
// Читатель может брать на руки и в читальный зал несколько книг.
public class Library {


    public static void main(String[] args) {
        CopyOnWriteArraySet<String> bookSet =new CopyOnWriteArraySet<>(); // организуем потокобезопасную коллекцию
        //добавляем в коллекцию книги
        bookSet.add("Сказка");
        bookSet.add("Поэма");
        bookSet.add("Толстой");
        bookSet.add("Тютчев");
        bookSet.add("свинка пепе");
        bookSet.add("старик");
        bookSet.add("слон");
        bookSet.add("грач");
        bookSet.add("продукты");
        bookSet.add("йогурт");
        bookSet.add("вата");
        bookSet.add("папа");
        bookSet.add("сатрик");
        bookSet.add("ываыа");
        bookSet.add("имчмсмсч");
        bookSet.add("шщшшщгш");
        bookSet.add("павпапв");

        System.out.println(bookSet);

        final int readerCount =20;  // читатели

        ExecutorService executorService = Executors.newFixedThreadPool(readerCount); // создаю пул потоков для запуска (количество читателей)

        executorService.execute(new Reader("сатрик",bookSet,"Олег"));
        executorService.execute(new Reader("сатрик",bookSet,"Олег2"));
        executorService.execute(new Reader("сатрик",bookSet,"Олег3"));
        executorService.execute(new Reader("сатрик",bookSet,"Олег4"));
        executorService.execute(new Reader("сатрик",bookSet,"Олег5"));

        executorService.execute(new Reader("вата",bookSet,"смав"));
        executorService.execute(new Reader("вата",bookSet,"свыф"));
        executorService.execute(new Reader("вата",bookSet,"ячсмс"));




    }

}


class Book {
    String nameBook;

    public Book(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                '}';
    }
}

class Reader implements Runnable{
    String bookRequest;
    CopyOnWriteArraySet<String> bookSet; //библиотека
    String nameReader;

    public Reader(String bookRequest, CopyOnWriteArraySet<String> bookSet, String nameReader) {
        this.bookRequest = bookRequest;
        this.bookSet = bookSet;
        this.nameReader = nameReader;
    }

    @Override
    public void run() {

        while(!bookSet.contains(bookRequest)){  //делаем проверку на наличие книги в библиотеке
            try {
                Thread.sleep(1000);  //если нет то ждем сек
            } catch (InterruptedException e) {  // ловим ошибки
                e.printStackTrace();
            }

            System.out.println("Книга "+bookRequest+ " занята");  //сообщение что книжки нет
        }

        try{
            bookSet.remove(bookRequest); //удаляем из библиотеке

            System.out.println( "Читатель " + nameReader +" взял книгу " + bookRequest);
            Random random=new Random();
            int i=random.nextInt(1000); // рандомное ожидание
            Thread.sleep(i);  // тут как бы читаем

            bookSet.add(bookRequest); //вернули после чтения
            System.out.println( "Читатель " + nameReader +" вернул книгу " + bookRequest);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}