package ru.mirea.IKBO1719.task7;

public class Human {
    private final Leg Leg;
    private final Head Head;
    private final Hand Hand;

    /*
    *   Constructs Human class object
    *
    *   Parameters:
    *   leg - Leg class object
    *   head - Head class object
    *   hand - Hand class object
    *
    */
    public Human(Leg leg, Head head, Hand hand) {
        Leg = leg;
        Head = head;
        Hand = hand;
    }

    /*
    *   Returns string representation of this class object
    *
    *   Parameters: no
    *
    *   Return: string of class properties
    *
    */
    public String toString() {
        return "Human leg: \nHeight = " + Leg.getHeight() + " Width = " + Leg.getWidth() + " Size = " + Leg.getLegSize() + "\n" +
                "Human hand: \nLength = " + Hand.getLength() + " Width = " + Hand.getWidth() + " Finger count = " + Hand.getFingerCount() + "\n" +
                "Human head: \nEye count = " + Head.getEyeCount() + " Ears count = " + Head.getEarsCount() + " Mouth count = " + Head.getMouthCount();
    }
}
