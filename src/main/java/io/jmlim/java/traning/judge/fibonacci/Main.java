package io.jmlim.java.traning.judge.fibonacci;

import java.util.Scanner;

/*
*
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
* */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fn2 = 1;
        int fn1 = 0;


        for(int i = 0; i < n; i++) {
            int fn = fn1 + fn2;
            fn1 = fn2;
            fn2 = fn;
        }
        System.out.println(fn1);
    }
}
