package io.jmlim.java.traning.judge.constant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        String s1 = s.split(" ")[0];
        String s2 = s.split(" ")[1];
        StringBuilder b1 = new StringBuilder(s1);
        StringBuilder b2 = new StringBuilder(s2);
        int num1 = Integer.parseInt(b1.reverse().toString());
        int num2 = Integer.parseInt(b2.reverse().toString());
        int num = num1 > num2 ? num1 : num2;
        System.out.println(num);
    }
}
