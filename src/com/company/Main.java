package com.company;

public class Main {

    public static void main(String[] args) {

        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Please enter a number to be multiplied.");
        int multiply = userInput.nextInt();
        int multiplier = 1;
        int sum = 0;

        while ((multiplier >= 1)  && (multiplier <= 10))
        {
            sum = multiplier * multiply;
            System.out.println(multiply + " * " + multiplier + " = " + sum);
            multiplier = multiplier + 1;
        }

    }
}
