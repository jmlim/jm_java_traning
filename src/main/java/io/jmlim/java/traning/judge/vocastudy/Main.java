package io.jmlim.java.traning.judge.vocastudy;

import java.util.*;

/*
* 문제
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

예제 입력 1
Mississipi
예제 출력 1
?
예제 입력 2
zZa
예제 출력 2
Z
예제 입력 3
z
예제 출력 3
Z
예제 입력 4
baaa
예제 출력 4
A
* */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        List<Character> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < input.length(); i++) {
            Character c = Character.toUpperCase(input.charAt(i));
            list.add(c);
            if(list.contains(c)) {
                //없을경우
                Integer cnt = map.get(c);
                if(map.get(c) == null) {
                    map.put(c, 0);
                } else {
                    cnt = map.get(c);
                    cnt++;
                    map.put(c, cnt);
                }
            }
        }

        int max = 0;
        int cnt = 0;
        char c = 0;
        int index = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(index == 0) {
                c = entry.getKey();
            }
            int value = entry.getValue();
            if(max != 0 && max == value) {
                cnt++;
                c = '?';
            }

            if(max < value) {
                max = value;
                cnt = 0;
                c = entry.getKey();
            }
            index++;
        }
        //System.out.println(map);
        //System.out.println(max + " " + cnt + " " + c);
        System.out.println(c);
    }
}
