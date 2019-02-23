package io.jmlim.java.traning.judge.programmers.lessons12935;


import java.util.Arrays;

/**
 * 제일 작은 수 제거하기
 * 문제 설명
 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 * <p>
 * 제한 조건
 * arr은 길이 1 이상인 배열입니다.
 * 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
 * 입출력 예
 * arr	return
 * [4,3,2,1]	[4,3,2]
 * [10]
 */
public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = arr.clone();
        Arrays.sort(arr);
        int min = arr[0];
        answer = Arrays.stream(answer).filter(x -> x != min).toArray();
        if (answer.length <= 1) {
            answer = new int[]{-1};
        }

        return answer;
    }

    // test case
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {4, 3, 2, 1};
        s.solution(arr);
        arr = new int[]{10};
        s.solution(arr);
    }
}
