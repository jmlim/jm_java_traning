package io.jmlim.java.traning.judge.dial;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
        list.add('D');
        list.add('G');
        list.add('J');
        list.add('M');
        list.add('P');
        list.add('T');
        list.add('W');
        String s = sc.next();
        int num = 3;
        int sum = 0;
        for (char a = 'A'; a <= 'Z'; a++) {
            if (list.contains(a)) {
                num++;
            }
            map.put(a, num);
        }
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sum += map.get(c);
        }
        System.out.println(sum);
    }
}
