package ru.mirea.IKBO1719.task11;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.PatternSyntaxException;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fio = scanner.nextLine();

        if (Validate(fio) == 1) {
            String[] arr = fio.split(" ", 3);

            System.out.println("Фамилия: " + arr[0]);
            System.out.println("Имя: " + arr[1]);
            System.out.println("Отчество: " + arr[2]);
        }
        if (Validate(fio) == 2) {
            String[] arr = fio.split(" ", 2);

            System.out.println("Фамилия: " + arr[0]);
            System.out.println("Имя: " + arr[1]);
        }
        if (Validate(fio) == 0) {
            System.out.println("Введённая строка не является ФИО");
        }
    }

    /**
     *   Determines if the string is valid and returns result code
     *
     *   @param fio                  string to validate
     *   @return                     1 - valid second name, name, patronymic; 2 - valid second name, name; 0 - invalid string
     */
    public static int Validate(String fio) {
        Pattern pattern;
        Matcher matcher;
        try {
            pattern = Pattern.compile("\\p{Lu}\\p{Ll}+(?:-\\p{Lu}\\p{Ll}+)* \\p{Lu}\\p{Ll}+ \\p{Lu}\\p{Ll}+"); //second name; name; patronymic
            matcher = pattern.matcher(fio);
            if (matcher.matches()) return 1;

            pattern = Pattern.compile("\\p{Lu}\\p{Ll}+(?:-\\p{Lu}\\p{Ll}+)* \\p{Lu}\\p{Ll}+"); //second name; name
            matcher = pattern.matcher(fio);
            if (matcher.matches()) return 2;

        } catch (PatternSyntaxException ex1) {
            System.out.println("Не корректный синтаксис регулярного выражения!");
        }
        return 0;
    }
}
