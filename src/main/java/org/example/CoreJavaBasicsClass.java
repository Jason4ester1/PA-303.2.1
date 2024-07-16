package org.example;

public class CoreJavaBasicsClass {

    public static void main(String[] args) {
        // Exercise 1
        int intVar1 = 5;
        int intVar2 = 10;
        int intSum = intVar1 + intVar2;
        System.out.println("Sum of two integers: " + intSum);

        // Exercise 2
        double doubleVar1 = 5.5;
        double doubleVar2 = 10.5;
        double doubleSum = doubleVar1 + doubleVar2;
        System.out.println("Sum of two doubles: " + doubleSum);

        // Exercise 3
        int intVar3 = 7;
        double doubleVar3 = 8.3;
        double mixedSum = intVar3 + doubleVar3;
        System.out.println("Sum of an integer and a double: " + mixedSum);
        System.out.println("Variable type of the sum: " + ((Object)mixedSum).getClass().getSimpleName());

        // Exercise 4
        int intVar4 = 20;
        int intVar5 = 4;
        int intDiv = intVar4 / intVar5;
        System.out.println("Division of two integers: " + intDiv);

        // Now change the larger number to a decimal
        double doubleVar4 = 20.0;
        double doubleDiv = doubleVar4 / intVar5;
        System.out.println("Division with larger number as decimal: " + doubleDiv);

        // Exercise 5
        double doubleVar5 = 25.5;
        double doubleVar6 = 5.1;
        double doubleDiv2 = doubleVar5 / doubleVar6;
        System.out.println("Division of two doubles: " + doubleDiv2);
        int castedResult = (int) doubleDiv2;
        System.out.println("Casted result: " + castedResult);
        int x = 5;
        int y = 6;
        double q = (double) y / x;
        System.out.println("Value of q (y/x): " + q);
        q = (double) y;
        System.out.println("Value of q after casting y to double: " + q);

        // Exercise 6
        final double PI = 3.14159;
        double radius = 5.0;
        double circumference = 2 * PI * radius;
        System.out.println("Circumference of the circle: " + circumference);

        // Exercise 7
        double coffeePrice = 3.5;
        double cappuccinoPrice = 4.5;
        double espressoPrice = 2.75;
        int coffeeOrder = 3;
        int cappuccinoOrder = 4;
        int espressoOrder = 2;
        double subtotal = (coffeeOrder * coffeePrice) + (cappuccinoOrder * cappuccinoPrice) + (espressoOrder * espressoPrice);
        final double SALES_TAX = 0.07;
        double totalSale = subtotal + (subtotal * SALES_TAX);
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Total Sale after tax: $%.2f\n", totalSale);
    }
}


