package io.jmlim.java.traning.judge.programmers.lessons49993;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 문제 설명
 * 선행 스킬이란 어떤 스킬을 배우기 전에 먼저 배워야 하는 스킬을 뜻합니다.
 * <p>
 * 예를 들어 선행 스킬 순서가 스파크 → 라이트닝 볼트 → 썬더일때, 썬더를 배우려면 먼저 라이트닝 볼트를 배워야 하고, 라이트닝 볼트를 배우려면 먼저 스파크를 배워야 합니다.
 * <p>
 * 위 순서에 없는 다른 스킬(힐링 등)은 순서에 상관없이 배울 수 있습니다. 따라서 스파크 → 힐링 → 라이트닝 볼트 → 썬더와 같은 스킬트리는 가능하지만,
 * 썬더 → 스파크나 라이트닝 볼트 → 스파크 → 힐링 → 썬더와 같은 스킬트리는 불가능합니다.
 * <p>
 * 선행 스킬 순서 skill과 유저들이 만든 스킬트리1를 담은 배열 skill_trees가 매개변수로 주어질 때, 가능한 스킬트리 개수를 return 하는 solution 함수를 작성해주세요.
 * <p>
 * 제한 조건
 * 스킬은 알파벳 대문자로 표기하며, 모든 문자열은 알파벳 대문자로만 이루어져 있습니다.
 * 스킬 순서와 스킬트리는 문자열로 표기합니다.
 * 예를 들어, C → B → D 라면 CBD로 표기합니다
 * 선행 스킬 순서 skill의 길이는 2 이상 26 이하이며, 스킬은 중복해 주어지지 않습니다.
 * skill_trees는 길이 1 이상 20 이하인 배열입니다.
 * skill_trees의 원소는 스킬을 나타내는 문자열입니다.
 * skill_trees의 원소는 길이가 2 이상 26 이하인 문자열이며, 스킬이 중복해 주어지지 않습니다.
 */
public class Solution {
    // 제출용
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String skillTree : skill_trees) {
            boolean cnt = true;
            // 앞에서 초기화 필요함.
            Queue<Character> q = new LinkedBlockingQueue<>();
            for (int i = 0; i < skill.length(); i++) {
                char c = skill.charAt(i);
                q.add(c);
            }

            // 담은 큐 중에 만약 해당되는 문자가 있다면 큐에 포함되어 있는지 보고 맨 앞에 넣은것인지 체크한다.
            // 그게 아니면 결과 카운트를 올리지 않는다.
            for (int i = 0; i < skillTree.length(); i++) {
                char c = skillTree.charAt(i);
                if (q.contains(c)) {
                    char standard = q.poll();
                    if (standard != c) {
                        cnt = false;
                        break;
                    }
                }
            }
            if (cnt) {
                answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }

    // test case
    public static void main(String[] args) {
        Solution s = new Solution();
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        s.solution(skill, skill_trees);
    }
}
