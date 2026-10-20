package com.pluralsight;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class addressbuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for Name
        System.out.println("Please provide the following information:");
        System.out.print("Full name: ");
        String name = scanner.nextLine().trim();

        // Prompt the user for Billing Input
        System.out.print("Billing Street: ");
        String street = scanner.nextLine().trim();
        System.out.print("Billing City: ");
        String city = scanner.nextLine().trim();
        System.out.print("Billing State: ");
        String state = scanner.nextLine().trim();
        System.out.print("Billing Zip: ");
        String zip = scanner.nextLine().trim();

        // New Line
        System.out.println();

        // Prompt the user for Shipping Input
        System.out.print("Shipping Street: ");
        String shipStreet = scanner.nextLine().trim();
        System.out.print("Shipping City: ");
        String shipCity = scanner.nextLine().trim();
        System.out.print("Shipping State: ");
        String shipState = scanner.nextLine().trim();
        System.out.print("Shipping Zip: ");
        String shipZip = scanner.nextLine().trim();

        // New Line
        System.out.println();

        // Display for Billing
        System.out.print(name);
        StringBuilder billing = new StringBuilder();
        billing.append("\nBilling Street: " + street);
        billing.append("\nBilling City: " + city);
        billing.append("\nBilling State: " + state);
        billing.append("\nBilling Zip: " + zip + "\n");

        String mybilling = billing.toString();
        System.out.print(mybilling);


        // New Line
        System.out.println();


        // Shipping Display
        StringBuilder shipping = new StringBuilder();
        shipping.append("Shipping Address: " + "\n" + shipStreet + "\n");
        shipping.append(shipCity + ", " + shipState + " " + shipZip);

        String myship = shipping.toString();
        System.out.println(myship);


    }
}
