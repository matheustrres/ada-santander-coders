package main;

import implementation.Supermarket;
import implementation.SupermarketArray;

import java.util.Scanner;

public class Main {
    private final static int SIZE = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Supermarket supermarket = new SupermarketArray(SIZE);

        int option;

        do {
            System.out.println("\nSupermarket shopping list:");
            System.out.println("1 - Add");
            System.out.println("2 - Show all");
            System.out.println("3 - Remove");
            System.out.println("4 - Exit");
            System.out.println("Enter your option: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the item to be added: ");
                    String item = scanner.next();
                    supermarket.add(item);
                    break;
                case 2:
                    supermarket.list();
                    break;
                case 3:
                    System.out.println("Enter the item to be removed: ");
                    int index = scanner.nextInt();
                    supermarket.delete(index);
                    break;
                case 4:
                    System.out.println("Closing program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please, try again.");
            }
        } while (option != 4);

        scanner.close();
    }
}