package com.work.study;

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num; ;
        do{
            System.out.println("Enter a number from 0 to 1000 ");
            num = scan.nextInt();
        }while(num > 1000);
                System.out.print("Sum of your numbers: ");
        int sum = 0;
        for(int n = num; n != 0; n /= 10)
        {
            sum += (n % 10);
        }
        System.out.print(sum + "!");
            }
    }
