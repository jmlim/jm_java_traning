package io.jmlim.java.traning.judge.programmers.tryout3930;

import java.util.ArrayList;
import java.util.List;

/**
 * 문제 설명
 * 직사각형을 만드는 데 필요한 4개의 점 중 3개의 좌표가 주어질 때, 나머지 한 점의 좌표를 구하려고 합니다.
 * 점 3개의 좌표가 들어있는 배열 v가 매개변수로 주어질 때,
 * 직사각형을 만드는 데 필요한 나머지 한 점의 좌표를 return 하도록 solution 함수를 완성해주세요.
 * 단, 직사각형의 각 변은 x축, y축에 평행하며, 반드시 직사각형을 만들 수 있는 경우만 입력으로 주어집니다.
 * <p>
 * 제한사항
 * v는 세 점의 좌표가 들어있는 2차원 배열입니다.
 * v의 각 원소는 점의 좌표를 나타내며, 좌표는 [x축 좌표, y축 좌표] 순으로 주어집니다.
 * 좌표값은 1 이상 10억 이하의 자연수입니다.
 * 직사각형을 만드는 데 필요한 나머지 한 점의 좌표를 [x축 좌표, y축 좌표] 순으로 담아 return 해주세요.
 */
public class Solution {
    public int[] solution(int[][] v) {

        // 다른방법도 찾아볼것..
        List<String> x = new ArrayList<>();
        List<String> y = new ArrayList<>();

        for(int i = 0; i < v.length; i++) {
            for(int j = 0; j < v[i].length; j++) {
                String numStr = v[i][j] + "";
                if(j == 0) {
                    numberFilter(x, numStr);
                } else if(j == 1) {
                    numberFilter(y, numStr);
                }
            }
        }

        //배열 합침
        x.addAll(y);
        int[] answer = new int[x.size()];
        for(int i = 0; i < x.size(); i++) {
            answer[i] = Integer.parseInt(x.get(i));
        }
        return answer;
    }

    public void numberFilter(List<String> numList, String numStr) {
        if(numList.contains(numStr)) {
            numList.remove(numStr);
        } else {
            numList.add(numStr);
        }
    }

    // test case
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] v = {{1, 4}, {3, 4}, {3, 10}};
        s.solution(v);
    }
}