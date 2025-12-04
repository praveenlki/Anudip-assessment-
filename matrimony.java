package com.anudip;

import java.util.Scanner;

public class matrimony{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter gender (male/female): ");
        String gender = sc.next();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        switch (gender) {

            case "female":
                if (age >= 18) {
                    System.out.println("Eligible for marriage.");
                } else {
                    System.out.println("Not eligible for marriage.");
                }
                break;

            case "male":
                if (age >= 21) {
                    System.out.println("Eligible for marriage.");
                } else {
                    System.out.println("Not eligible for marriage.");
                }
                break;

            default:
                System.out.println("Invalid gender entered!");
        }
    }
}