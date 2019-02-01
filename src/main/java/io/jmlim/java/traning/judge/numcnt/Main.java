package io.jmlim.java.traning.judge.numcnt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        int []output = new int[10];
        long sum = 1;
        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            sum *= a[i];
        }
        for(long i = sum; i > 0; i/=10) {
            //System.out.println( ( sum % i));
            int length = (int)(Math.log10(i));
            int pow = (int) Math.pow(10, length);
           // System.out.println((int)Math.pow(10, length)  + " " + sum);
            output[(int)(sum / pow)]++;
            //System.out.println(sum / pow);
            sum = sum % pow;
        }
        for(int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}