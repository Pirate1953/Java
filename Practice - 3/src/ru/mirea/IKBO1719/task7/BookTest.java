package ru.mirea.IKBO1719.task7;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Sergey", "Island Low", 2005, 2,45, 56);
        book.setAuthor("Kirill");
        book.setName("LOL");
        book.setPagesCount(55);
        book.setDate(2003, 11, 1);
        System.out.println("Book:\nName = " + book.getName() + " Author = " + book.getAuthor() + " Pages = " + book.getPagesCount() + " Created at = " + book.getDate());
    }
}
