package io.jmlim.java.traning.judge.forr.sumofnumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        String input = sc.next();
        int sum = 0;
        for(int i = 0; i < row; i++) {
            int num = Integer.parseInt(String.valueOf(input.charAt(i)));
            sum += num;

        }
        System.out.println(sum);
    }
}
