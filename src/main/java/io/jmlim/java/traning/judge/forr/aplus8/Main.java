package io.jmlim.java.traning.judge.forr.aplus8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < num; i++ ) {
            String input = in.readLine();
            String []arr = input.split(" ");
            int sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
            if(i != 0) builder.append("\n");
            builder.append(sum);
        }
        System.out.println(builder.toString());
    }
}
