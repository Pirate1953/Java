package ru.mirea.IKBO1719.task11;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> dealsList = new ArrayList<>(0);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String command = scanner.nextLine(); //Advances this scanner past the current line and returns the input that was skipped

            String option;
            if (findSpacebars(command) > 0) {
                option = command.substring(0, command.indexOf(' '));
            }
            else {
                option = command;
            }

            switch (option) {
                case "ADD": {
                    if (findSpacebars(command) > 1 && findSpacebars(command) > 0) {
                        String number = command.substring(4, command.indexOf(' ', 4)); //Returns substring between first and second space symbols (where number is)
                        if (Character.isDigit(number.charAt(0))) { //Determines if symbol at the specified position in the argument string is digit
                            try {
                                addElementAtSpecifiedPos(dealsList, Integer.parseInt(number), command.substring(5 + number.length()));
                            }
                            catch (IndexOutOfBoundsException ex) {
                                System.out.println("Порядковый номер не должен быть больше предыдущего на 2 и более значений");
                            }
                            break;
                        }
                    }
                    if (findSpacebars(command) == 1 && findSpacebars(command) > 0) {
                            dealsList.add(command.substring(4));
                            break;
                        }
                    }

                case "LIST": {
                    list(dealsList);
                    break;
                }

                case "EDIT": {
                    if (findSpacebars(command) > 1 && findSpacebars(command) > 0) {
                        String number = command.substring(5, command.indexOf(' ', 5)); //Returns substring between first and second space symbols (where number is)
                        if (Character.isDigit(number.charAt(0))) { //Determines if symbol at the specified position in the argument string is digit
                            dealsList.remove(Integer.parseInt(number));
                            addElementAtSpecifiedPos(dealsList, Integer.parseInt(number), command.substring(6 + number.length()));
                            break;
                        }
                    } else {
                        System.out.println("Синтаксис команды: EDIT <#id> <#name>");
                        break;
                    }
                }

                case "DELETE": {
                    if (findSpacebars(command) > 0) {
                        String number = command.substring(7);
                        if (Character.isDigit(number.charAt(0))) { //Determines if symbol at the specified position in the argument string is digit
                            dealsList.remove(Integer.parseInt(number));
                            break;
                        }
                    } else {
                        System.out.println("Синтаксис команды: DELETE <#id>");
                        break;
                    }
                }
            }
        }
    }

    /**
     * Inserts the specified element at the specified position in the specified list.
     *
     * @param deals specified list
     * @param pos specified position
     * @param deal specified element to add
     */
    static void addElementAtSpecifiedPos(ArrayList<String> deals, int pos, String deal) {
        deals.add(pos, deal);
    }

    /**
     * Prints all elements with their id from the specified list
     *
     * @param deals list containing elements to be printed
     */
    static void list(ArrayList<String> deals) {
        for (int i = 0; i < deals.size(); i++) {
            System.out.println(i + " -> " + deals.get(i));
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
}
