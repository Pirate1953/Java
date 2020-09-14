package ru.mirea.IKBO1719.task7;

public class Hand {
    private int Length;
    private int Width;
    private int FingerCount;

    public Hand(int length, int width, int fingerCount) {
        Length = length;
        Width = width;
        FingerCount = fingerCount;
    }

    public void setLength(int length) {
        Length = length;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public void setFingerCount(int fingerCount) {
        FingerCount = fingerCount;
    }

    public int getLength() {
        return Length;
    }

    public int getWidth() {
        return Width;
    }

    public int getFingerCount() {
        return FingerCount;
    }
}
