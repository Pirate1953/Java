package ru.mirea.IKBO1719.task11;

import java.util.Scanner;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        TreeSet<String> emailList = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String command = scanner.nextLine(); //Advances this scanner past the current line and returns the input that was skipped

            String option;
            if (findSpacebars(command) == 1) {
                option = command.substring(0, command.indexOf(' '));
            } else {
                option = command;
            }

            switch (option) {
                case "ADD": {
                    if (findSpacebars(command) == 1) {
                        String email = command.substring(4); //Returns substring between first and space symbols and the end of the string (where email is)
                        if (!isValidEmail(email)) {
                            emailList.add(email);
                            break;
                        }
                    }
                    else {
                        System.out.println("Синтаксис команды: ADD <#email>");
                        break;
                    }
                }

                case "LIST": {
                    list(emailList);
                    break;
                }
            }
        }
    }

    /**
     * Returns count of the spacebars in the specified string
     *
     * @param command specified string
     *
     * @return count of the spacebars in the specified string
     */
    static int findSpacebars(String command) {
        int counter = 0;
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == ' ') {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Prints all elements from the specified set
     *
     * @param deals list containing elements to be printed
     */
    static void list(TreeSet<String> deals) {
        System.out.println(deals);
    }

    /**
     * Determines if email is valid, returns true if email is valid, false otherwise
     *
     * @param email email to validate
     */
    static boolean isValidEmail(String email) {
        boolean isValid = true;
        int index_of_char = 0;
        if (email.contains("@") && email.contains(".")) {
            if (email.charAt(0) != '@' && email.charAt(0) != '.') {
                for (int i = 0; i < email.length(); i++) {
                    if (email.charAt(i) == ' ') {
                        index_of_char = i;
                        break;
                    }
                }
                String substring = email.substring(index_of_char);
                if (substring.contains(".ru") || substring.contains(".com") || substring.contains(".org")) {
                    for (char c : email.toCharArray()) {
                        if (!(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z')) { //Determines if each character in the string in english
                            isValid = false;
                            break;
                        }
                    }
                }
            }
        }
        return isValid;
    }
}
