package io.jmlim.java.traning.judge.arr.oxquiz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String []str = new String[size];
        for(int i = 0; i< size; i++) {
            str[i] = sc.next();
        }
        for(int i = 0; i < str.length; i++ ) {
            String s = str[i];
            int sum = 0;
            char pc = 'N';
            int add = 1;
            for(int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if(c == 'O' && c == pc) {
                    add++;
                    sum = sum + add;
                } else if (c == 'O' && c != pc) {
                    sum = sum + 1;
                    add = 1;
                }
                pc = c;
            }
            System.out.println(sum);
        }
    }
}
