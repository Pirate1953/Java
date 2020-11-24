package ru.mirea.IKBO1719.task11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import  javax.swing.text.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber = scanner.nextLine();

        if (Validate(phoneNumber) == 0) {
            System.out.println("Неверный формат номера");
        }

        if (Validate(phoneNumber) == 1) {
            System.out.println(formatPhoneNumber(phoneNumber));
        }
    }

    /**
     *   Determines if the phone number is valid and returns result code
     *
     *   @param phoneNumber          phone number to validate
     *   @return                     1 - valid phone number; 0 - invalid string
     */
    public static int Validate(String phoneNumber) {
        Pattern pattern;
        Matcher matcher;
        try {
            pattern = Pattern.compile("(\\+7|7|8)?[\\s\\-]?\\(?[489][0-9]{2}\\)?[\\s\\-]?[0-9]{3}[\\s\\-]?[0-9]{2}[\\s\\-]?[0-9]{2}");
            matcher = pattern.matcher(phoneNumber);
            if (matcher.matches()) return 1;
        } catch (PatternSyntaxException ex1) {
            System.out.println("Не корректный синтаксис регулярного выражения!");
        }
        return 0;
    }

    /**
     *   Returns formatted phone number
     *
     *   @param phoneNumber          phone number to format
     *   @return                     formatted phone number
     */
    public static String formatPhoneNumber(String phoneNumber) {
        String phoneMask= "+# (###) ###-##-##";
        String res = "";
        try {
            MaskFormatter maskFormatter= new MaskFormatter(phoneMask);
            maskFormatter.setValueContainsLiteralCharacters(false);
            res = phoneNumber.replaceAll("[-+ ()]*", "");

            if (res.charAt(0) == '8') {
                res = res.replace(res.charAt(0), '7');
                res = maskFormatter.valueToString(res);
            }
            if (res.charAt(0) == '7') {
                res = maskFormatter.valueToString(res);
            }
            if (res.length() == 10) {
                res = "7" + res;
                res = maskFormatter.valueToString(res);
            }
        } catch (Exception ex) {
            System.out.println("В методе formatPhoneNumber класса Main3\n" + ex.getMessage());
        }

        return res;
    }
}
