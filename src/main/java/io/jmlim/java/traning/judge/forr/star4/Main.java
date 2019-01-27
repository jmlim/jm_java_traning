package io.jmlim.java.traning.judge.forr.star4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
       /* for (int i = 0; i < input; i++) {
            for(int j = 5; j > 0; j--) {
                if(j > i + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }*/
        /*for (int i = 0; i < input; i++) {
            for(int j = 0; j < input; j++) {
                if( i <= j ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
        for (int i = 0; i < input; i++) {
            for(int j = input - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
