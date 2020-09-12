package ru.mirea.IKBO1719.task6;

public class Main {

    public static void main(String[] args) {
	    Shape shape = new Shape("Circle");
	    System.out.println(shape);
	    shape.setName("LOL");
        System.out.println(shape.getName());


	    Ball ball = new Ball("Ball 1");
        System.out.println(ball);
        ball.setName("Ball 2");
        System.out.println(ball.getName());

        Book book = new Book("Book 1");
        System.out.println(book);
        book.setName("Book 2");
        System.out.println(book.getName());

        System.out.println();

        Dog dog = new Dog("Dog", 2);
        System.out.println(dog);
        dog.setName("Bee");
        dog.setAge(4);
        System.out.println("Name = " + dog.getName() + " Age = " + dog.getAge());
        System.out.println("Human ages = " + dog.getHumanAges());

        DogKennel ken = new DogKennel(4);
        ken.addDog("GG WP", 3);
        ken.testShowCreatedDogs();
    }
}
