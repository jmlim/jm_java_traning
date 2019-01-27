package io.jmlim.java.traning.judge.stack.bracket;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 0; i < num; i++) {
            String input = sc.next();
            Stack<Character> stack = new Stack<>();
            boolean isTrue = true;
            for(int j = 0; j < input.length(); j++) {
                Character c = input.charAt(j);
                if(c == '(') {
                    stack.push(c);
                } else if(c == ')') {
                    if(stack.empty()) {
                        isTrue = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if(stack.empty() && isTrue) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
