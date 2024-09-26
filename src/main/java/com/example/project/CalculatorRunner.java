package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {

        //test your program here
        //1. create an instance of the calculator class
        Calculator ti84 = new Calculator("TI84");
        //2. call any methods of that class to test
        System.out.println(ti84.performOperation("+", 5, 10));
        System.out.println(ti84.performOperation("-", 5, 10));
        System.out.println(ti84.performOperation("*", 5, 10));
        System.out.println(ti84.performOperation("/", 5, 10));
        System.out.println(ti84.performOperation("?", 5, 10));

        System.out.println(ti84.divisibleBy(13, 7));
        System.out.println(ti84.divisibleBy(14, 7));

        System.out.println(ti84.coordinatePair(-9, 32));
        
        System.out.println(ti84.absoluteValue(15, 36));
        
        System.out.println(ti84.info());
    }
}
