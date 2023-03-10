package com.objectMethods;

import java.util.Objects;

/*
Создайте класс с именем "Book", который имеет поля "title", "author" и "price".
Переопределите метод toString, чтобы он выводил всю информацию о книге.
Переопределите метод equals, чтобы он сравнивал две книги по заголовку и автору.
Переопределите метод hashCode, чтобы он вычислял хэш-код для книги на основе ее заголовка и автора.
Не переопределяйте метод finalize, поскольку он устарел и используется только в экстренных случаях.
Переопределите метод clone, чтобы сделать глубокую копию книги.
Создайте экземпляры книг и проверьте работу всех переопределенных методов.
 */
public class Book implements Cloneable {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book() {
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(title, author);
//    }
    @Override
    public int hashCode() {
        return 31 * (title != null? title.hashCode(): 0) + (author != null? author.hashCode(): 0);
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == this) {
//            return true;
//        } else if (obj == null || getClass() != obj.getClass()) {
//            return false;
//        }
//        Book book = (Book) obj;
//
//        return Objects.equals(book.author, author) && Objects.equals(book.title, title);
//    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;

        return book.author.equals(author) && book.title.equals(title);
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        Book cloneBook = new Book(this.getTitle(), this.getAuthor(), this.getPrice());
//        return cloneBook;
//    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Book cloneBook = new Book(this.getTitle(), this.getAuthor(), this.getPrice());
        return cloneBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Book book = new Book("Harry Potter", "Jhoan Rowling", 1567);
        Book cloneBook = (Book) book.clone();
        System.out.println(book);
        System.out.println(cloneBook);
        System.out.println("__________________");
        System.out.println(book.equals(cloneBook));
        System.out.println("__________________");
        book.setAuthor("J.R.Tolkien");
        book.setTitle("Lord of the Rings");
        book.setPrice(1276);
        System.out.println(book);
        System.out.println(cloneBook);
    }
    /*
    Обратите внимание, что метод clone() должен быть помечен как public,
    а не protected, если вы хотите, чтобы он был доступен из других классов.

В методе hashCode() вы используете утилитный метод Objects.hash(), который
вычисляет хеш-код на основе нескольких объектов. Это удобный способ вычисления
хеш-кода, но учтите, что вы можете самостоятельно вычислить хеш-код, используя
комбинацию хеш-кодов каждого поля.

В методе equals() вы используете утилитный метод Objects.equals() для сравнения
двух объектов. Это удобный способ сравнения, но учтите, что вы также можете сравнивать
объекты, используя сравнение своих полей.

Пример finalize() для логирования:
class Resource {
    private static Logger logger = Logger.getLogger(Resource.class.getName());

    @Override
    protected void finalize() throws Throwable {
        logger.info("The Resource object is being garbage collected");
        super.finalize();
    }
}
     */
}
