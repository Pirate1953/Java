package ru.mirea.IKBO1719.task7;

public class Head {
    private int EyeCount;
    private int EarsCount;
    private int MouthCount;

    public Head(int eyeCount, int earsCount, int mouthCount) {
        EyeCount = eyeCount;
        EarsCount = earsCount;
        MouthCount = mouthCount;
    }

    public void setEyeCount(int count) {
        EyeCount = count;
    }

    public void setEarsCount(int count) {
        EarsCount = count;
    }

    public void setMouthCount(int count) {
        MouthCount = count;
    }

    public int getEyeCount() {
        return EyeCount;
    }

    public int getEarsCount() {
        return EarsCount;
    }

    public int getMouthCount() {
        return MouthCount;
    }
}
