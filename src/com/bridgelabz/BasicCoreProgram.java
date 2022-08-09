package com.bridgelabz;

import java.util.Scanner;

public class BasicCoreProgram {
    public void flipCoin(){
        int head = 0;
        int tail = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("The number of time coin flips");
        int n = obj.nextInt();

        while (n >= 0) {
            for (int i = 1; i <= n; i++) {
                double coin = Math.random();
                if (coin > 0.5) {
                    head++;
                    n--;
                } else {
                    tail++;
                    n--;
                }
                double percenthead = (head * 100) / 10;
                double percenttail = (tail * 100) / 10;
                System.out.println("Heads " + head);
                System.out.println("Tails " + tail);
                System.out.println("Percentage of Head " + percenthead);
                System.out.println("Percentage of tail " + percenttail);

            }
            break;
        }

    }
    public void leapYear(){
        Scanner l = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = l.nextInt();

        if (year > 999 && year < 10000) { // remainder of year is equal to 0
            if (year % 4 == 0) {
                System.out.println("Leap year " + year);
            } else {
                System.out.println("Not a Leap year " + year);
            }

        }

     }
    public void powerOfTwo(){
         Scanner p = new Scanner(System.in);
         System.out.println("Enter number");
         int n = p.nextInt();
         int poweroftwo = 1;
         for (int i = 0; i < n; i++) {
             System.out.println(i + " " + poweroftwo);
             poweroftwo = 2 * poweroftwo;
         }
    }
    public void harmonicNumber(){
        Scanner ha = new Scanner(System.in);
        System.out.println("Enter The number");
        int num = ha.nextInt();
        double sum = 0.0;

        for (double i = 1; i <= num; i++) {
            sum = sum + 1 / i;
        }
        System.out.println("Sum is " + sum);
    }

    public static void main(String[] args) {
        System.out.println("Basic Core Program ");
        BasicCoreProgram basicCoreProgram = new BasicCoreProgram();
        System.out.println("*********  Flip Coin Program **********");
        basicCoreProgram.flipCoin();
        System.out.println("*********  Leap Year Program **********");
        basicCoreProgram.leapYear();
        System.out.println("*********  Power Of Two Program **********");
        basicCoreProgram.powerOfTwo();
        System.out.println("*********  Harmoic Number Program **********");
        basicCoreProgram.harmonicNumber();
    }
}
