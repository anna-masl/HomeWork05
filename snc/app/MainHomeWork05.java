package app;

import java.util.Scanner;

public class MainHomeWork05 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your income: ");
        double income = sc.nextDouble();
        double tax;
        if (income > 0 && income <= 10000) {
            tax = income * 0.025;
            System.out.println("Your tax will be: " + tax);
        } else if (income > 10000 && income <= 25000){
            tax = income * 0.045;
            System.out.println("Your tax will be: " + tax);
        } else if (income > 25000){
            tax = income * 0.067;
            System.out.println("Your tax will be: " + tax);
        } else
            System.out.println("No tax");

    }
}
