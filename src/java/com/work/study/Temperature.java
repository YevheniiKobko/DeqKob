package com.work.study;
import java.util.Scanner;
public class Temperature {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the temperature in Fahrenheit: ");
            double a = scan.nextDouble();
            System.out.println(a + " degree Fahrenheit is equal to " + ((a - 32) * 5/9) + " in Celsius");
        }
    }

