package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary, tax, taxLevelTwo, taxLevelThree, taxLevelFour;

        System.out.println("Enter your salary: ");
        salary = sc.nextDouble();

        if (salary <= 2000.0){
            tax = 0;
        }
        else if (salary <= 3000.0){
            taxLevelTwo = salary - 2000;
            tax = (taxLevelTwo * 0.08);

        }
        else if (salary <= 4500.0){
            taxLevelThree = salary - 3000.0;
            taxLevelTwo = 1000.0;
            tax = (taxLevelTwo * 0.08) + (taxLevelThree * 0.18);
        }
        else {
            taxLevelFour = salary - 4500.0;
            taxLevelThree = 1500.0;
            taxLevelTwo = 1000.0;
            tax = (taxLevelFour * 0.28) + (taxLevelThree * 0.18) + (taxLevelTwo * 0.08);
        }

        if (tax == 0) {
            System.out.println("Tax free");
        } else{
            System.out.printf("Taxes = %.2f%n", tax);
        }
        
        sc.close();
    }
}
