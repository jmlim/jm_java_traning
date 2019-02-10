package io.jmlim.java.traning.judge.programmers.lessons12926;

import java.util.ArrayList;
import java.util.List;

/**
 * 문제 설명
 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
 * 예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다. z는 1만큼 밀면 a가 됩니다.
 * 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
 * <p>
 * 제한 조건
 * 공백은 아무리 밀어도 공백입니다.
 * s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
 * s의 길이는 8000이하입니다.
 * n은 1 이상, 25이하인 자연수입니다.
 * 입출력 예
 * s	n	result
 * AB	1	BC
 * z	1	a
 * a B z
 */
public class Solution {
    public String solution(String s, int n) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        List<Character> lowerAlphabetList = new ArrayList<>();
        List<Character> upperAlphabetList = new ArrayList<>();

        char[] lower = alphabet.toCharArray();
        char[] upper = alphabet.toUpperCase().toCharArray();

        //추후 간결하게 할것..
        for (char c : lower) {
            lowerAlphabetList.add(c);
        }

        for (char c : upper) {
            upperAlphabetList.add(c);
        }

        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean isUpper = Character.isUpperCase(c);
            if (isUpper) {
                answer = makeAnswer(upperAlphabetList, answer, c, n);
            } else {
                answer = makeAnswer(lowerAlphabetList, answer, c, n);
            }
        }
        return answer;
    }

    public String makeAnswer(List<Character> alpabetList, String answer, char c, int n) {
        int size = alpabetList.size();
        int index = alpabetList.indexOf(c);
        if (index == -1) {
            answer = answer + " ";
            return answer;
        }
        int point = index + n;
        if (point >= size) {
            point = point - size;
        }
        answer = answer + "" + alpabetList.get(point);
        return answer;
    }

    // test case
    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "aBBc";
        int n = 4;
        System.out.println(s.solution(str, n));
    }
}
