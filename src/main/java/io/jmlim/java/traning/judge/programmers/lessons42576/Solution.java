package io.jmlim.java.traning.judge.programmers.lessons42576;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 문제 설명
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
 * <p>
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 * <p>
 * 제한사항
 * 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
 * completion의 길이는 participant의 길이보다 1 작습니다.
 * 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
 * 참가자 중에는 동명이인이 있을 수 있습니다.
 * 입출력 예
 * participant	completion	return
 * [leo, kiki, eden]	[eden, kiki]	leo
 * [marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
 * [mislav, stanko, mislav, ana]	[stanko, ana, mislav]	mislav
 * 입출력 예 설명
 * 예제 #1
 * leo는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
 * <p>
 * 예제 #2
 * vinko는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
 * <p>
 * 예제 #3
 * mislav는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.
 */
public class Solution {
    public String solution(String[] participant, String[] completion) {

        Map<String, List<String>> participantMap = new HashMap<>();
        for(String participantStr : participant) {
            List<String> participantList = participantMap.get(participantStr);
            if(participantList == null) {
                participantList = new ArrayList<>();
            }

            participantList.add(participantStr);
            participantMap.put(participantStr, participantList);
        }

        for(String completionStr : completion) {
            List<String> compList = participantMap.get(completionStr);
            if(compList.size() > 1) {
                compList.remove(completionStr);
            } else {
                participantMap.remove(completionStr);
            }
        }

        // 하나라는 전제가 있음.
        String answer = participantMap.keySet().toArray()[0].toString();
        return answer;

        //남들 푼거보니 멍청하게 풀었네.. 그냥 value를 숫자 카운트로 해도 되는디-ㅅ- 일단 그냥 올림
    }

    // test case
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        s.solution(participant, completion);
    }

}