package io.jmlim.java.traning.judge.stack.stackk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StackJm {
    private long[] stack;

    private int top = 0;
    public StackJm(long[] stack) {
        this.stack = stack;
    }

    public void push(long num) {
        stack[top++] = num;
    }

    public long pop() {
        if(top <= 0) {
            return -1;
        }
        return stack[--top];
    }

    public long size() {
        return top;
    }

    public long top() {
        if(top <= 0) {
            return -1;
        }
        return stack[top - 1];
    }

    public long empty() {
        if(top > 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num =  Integer.parseInt(in.readLine());
        StackJm sk = new StackJm(new long[num]);
        for(int i = 0; i < num; i++) {
            String str = in.readLine();
            long rtn = 0;
            if(str.indexOf("push") != -1) {
                sk.push(Long.parseLong(str.split(" ")[1]));
                continue;
            } else if(str.equals("top")) {
               rtn = sk.top();
            } else if(str.equals("size")) {
                rtn = sk.size();
            } else if(str.equals("pop")) {
                rtn = sk.pop();
            } else if(str.equals("empty")) {
                rtn = sk.empty();
            }
            System.out.println(rtn);
        }
    }
}
