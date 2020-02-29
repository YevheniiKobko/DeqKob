package com.work.study;
import java.util.Scanner;
public class InchesToMeters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a value for inch: ");
        double inch = scan.nextDouble();
        double meters = inch / 39.370;
        System.out.println(inch + " inch is " + meters + " meters.");
    }
}
