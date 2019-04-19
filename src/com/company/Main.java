package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = keyboard.nextInt();
        int count=0;
        int i,j;

        for (j = 1; j <= number; j++) {
            count=0;

            for (i = 2; i < j; i++) {
                if (j % i == 0)
                    count += 1;
            }
            if (j==1)
                count=1;
            if (count == 0)
                System.out.println(j + " is a prime number");
            else
                System.out.println(j + " is not a prime number");
        }
    }
}
