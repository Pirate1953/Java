package ru.mirea.IKBO1719.task7;

public class Leg {
    private int Height;
    private int Width;
    private int LegSize;

    public Leg(int height, int width, int legSize) {
        Height = height;
        Width = width;
        LegSize = legSize;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public void setLegSize(int legSize) {
        LegSize = legSize;
    }

    public int getHeight() {
        return Height;
    }

    public int getWidth() {
        return Width;
    }

    public int getLegSize() {
        return LegSize;
    }
}
