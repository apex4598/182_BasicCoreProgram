package com.bridgelabz;

import java.util.Scanner;

public class BasicCoreProgram {
    void flipCoin(){
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
        }

}
    public static void main(String[] args) {
        System.out.println("Basic Core Program ");
        BasicCoreProgram basicCoreProgram = new BasicCoreProgram();
        System.out.println("*********  Flip Coin Program **********");
        basicCoreProgram.flipCoin();
        
    }
}
