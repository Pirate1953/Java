package ru.mirea.IKBO1719.task8;

public class Main {

    public static void main(String[] args) {
        Author g = new Author("Sergey", "ser@gmail.com", 'M');
        System.out.println(g.getEmail());
        System.out.println(g.getGender());
        System.out.println(g.getName());
        g.setEmail("sergey@gmail.com");
        System.out.println(g.toString());
    }
}
