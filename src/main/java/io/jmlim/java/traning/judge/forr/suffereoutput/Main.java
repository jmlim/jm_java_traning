package io.jmlim.java.traning.judge.forr.suffereoutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        for(int i = 0; i < input.length(); i++ ) {
            if(i % 10 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(input.charAt(i));
        }
    }
}
