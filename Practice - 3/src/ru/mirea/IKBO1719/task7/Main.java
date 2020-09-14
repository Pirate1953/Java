package ru.mirea.IKBO1719.task7;

public class Main {
    public static void main(String[] args) {
        CircleTest.main(null); //Calls static main method of another class (CircleTest)

        Leg leg = new Leg(50, 30, 48);
        Hand hand = new Hand(50, 10, 5);
        Head head = new Head(2, 2, 1);
        Human human = new Human(leg, head, hand);

        System.out.println();
        System.out.println(human);

        leg.setHeight(60);
        leg.setWidth(32);
        leg.setLegSize(49);

        hand.setLength(60);
        hand.setWidth(32);
        hand.setFingerCount(49);

        head.setEyeCount(2);
        head.setEarsCount(2);
        head.setMouthCount(1);

        System.out.println();
        System.out.println(human);

        BookTest.main(null);
    }
}
