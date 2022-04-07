package com.company;

import java.util.Scanner;

/**
 * Bank java application, oop practice.
 * by Joseph NTADI
 * Main method
 */
public class Main {
    private static double amount = 0;

    public static void main(String[] args) {
	    Account account1 = new Account(246890L,"Joseph",0,"19548810266");

        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("       Welcome to "+account1.getBankName()+" bank");
        System.out.println("              1 for => Inquiry");
        System.out.println("              2 for => Deposit");
        System.out.println("              3 for => Withdraw");
        System.out.println("              4 for => Exit");
        System.out.println("========================================");

        while (true){
            amount =0;
            Integer choice ;
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    account1.inquiry();
                    break;
                case 2:
                    System.out.print("Enter the amount for the deposit: ");
                    amount = scanner.nextDouble();
                    account1.deposit(amount);
                    break;
                case 3:
                    System.out.println("Enter the amount to withdraw: ");
                    amount = scanner.nextDouble();
                    account1.withdraw(amount);
                    break;
                case 4:
                    System.out.println("Thank you for using our service, goodbye !");
                    System.exit(0);
                    break;
                 default:
                     System.out.println("Sorry entered number is invalid, try again");
            }
        }


    }
}
