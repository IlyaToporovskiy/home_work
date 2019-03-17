package com.companyName.lessons;

public class Main {
    public static void main(String[] args) {
        //тип данных имя_объекта = new создание объекта (вызов_конструктора)
        Book book1 = new Book(); //все пользовательские объекты создаются в куче(heap)
        System.out.println(book1); //значения по дефолту

        // задать свойства объекту
        // обращение к свойству объекта
//        book1.pageCount =-34;
        book1.setPageCount(34);
        book1.setTitle("Азбука");
//        book1.title="Азбука";
        System.out.println(book1);

        Book book2 = new Book();
//        book2.pageCount=122;
//        book2.title="Сказки";
        book2.setTitle("Сказки");
        book2.setPageCount(122);

        System.out.println(book2);

        Book book3 = new Book(89);
        System.out.println(book3);

        Book book4 = new Book(223,"Story");
        System.out.println(book4);

       int book4Page= book4.getPageCount();
        System.out.println("book4PageCount = "+book4Page);

        Author author = new Author("Иван","Петров");
        book4.setAuthor(author);

        Library library =new Library();
//        library.addBook(Book book); //метод добавления в библиотеку
//        library.getBook(String bookTitle);
        library.addBook(book1); //метод добавления в библиотеку
        library.addBook(book2); //метод добавления в библиотеку
        System.out.println(library);
        System.out.println(library.getBook("Сказки"));





//        MyList list = new MyList();
//        list.add(2);

    }
}
