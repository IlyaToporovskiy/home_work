package com.companyName.lessons;

import java.util.Arrays;   // позволяет импортировать класс

public class Book {
    //свойства класса(атрибуты/поля)
    //правильно закрывать доступ к свойствам
    private int pageCount;  // свойства будут у объектов созданных на основе Book
    private String title;
    private Author author;

    //конструктор
    public Book() {} //конструктор по умолчанию
    // нужно описать если есть другие конструкторы и нужно констр. по умолч

    public Book(int pageCount){
        this.pageCount=pageCount;
    }
    public Book(int pageCount,String title){
        this.pageCount=pageCount;
        this.title=title;
    }
//    public Book(String name,String surname){  //неккоректный вариант , нужно передавать объект целиком см. ниже
//        this.author=new Author(name,surname);
//    }
        public Book(Author author){  //ккоректный вариант , передаем созданный объект
        this.author=author;
    }


    public void setPageCount(int pageCount) {
        // можно написать условие
        //проверка входящих данных
        if (pageCount < 1) {
            System.out.println("Ошибка в количестве страниц");
            return;  //прерывает работу метода,
        }
        this.pageCount = pageCount;  //this ссылка на текущий объект
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() { // тип данных объект(Author)
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getTitle() {
        return title;
    }



    //alt+(fn)+insert
    // можно выводить данные
    @Override
    public String toString() {
        return "Book{" +
                "pageCount=" + pageCount +
                ", title='" + title + '\'' +
                '}';
    }
}
