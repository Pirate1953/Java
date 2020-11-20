package ru.mirea.IKBO1719.task11;

public class Main {
    public static void main(String[] args) {
	    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println(sum(text));
    }

    /**
     *   Calculates sum of extracted values of roubles from the string
     *
     *   @param text                 string to extract values
     *   @return                     sum of roubles
     */
    public static int sum(String text) {
        int result = 0;
        try {
            result = Integer.parseInt(text.substring(15, 19)) + Integer.parseInt(text.substring(text.length() - 12, text.length() - 7));
        } catch (NumberFormatException ex1) {
            System.out.println("Строка не содержит цифр!");
        } catch (IndexOutOfBoundsException ex2) {
            System.out.println("Индекс за пределами длины строки!");
        }
        return result;
    }
}
