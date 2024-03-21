package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        System.out.println("Your choice: ");
        int value = scanner.nextInt();
        while (value != 0 && value !=1) {
            System.out.println("Выберете между 0 и 1");
            value = scanner.nextInt();
        }
            if (value == 1) {
                System.out.println("Welcome to the Brain Games!");
                Cli.cli();
            } else if (value == 0) {
                scanner.close();
            }

    }
    }

