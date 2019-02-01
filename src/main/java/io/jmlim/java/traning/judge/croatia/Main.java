package io.jmlim.java.traning.judge.croatia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/***
 *
 * 예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.
 *
 * 크로아티아 알파벳	변경
 * č	c=
 * ć	c-
 * dž	dz=
 * ñ	d-
 * lj	lj
 * nj	nj
 * š	s=
 * ž	z=
 * 예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 *
 * dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
 *
 * 입력
 * 첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
 *
 * 문제 설명에 나와있는 크로아티아 알파벳만 주어진다.
 *
 * 출력
 * 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 *
 * 예제 입력 1
 * ljes=njak
 * 예제 출력 1
 * 6
 * 예제 입력 2
 * ddz=z=
 * 예제 출력 2
 * 3
 * 예제 입력 3
 * nljj
 * 예제 출력 3
 * 3
 * 예제 입력 4
 * c=c=
 * 예제 출력 4
 * 2
 */
public class Main {
/*    private static Pattern pattern1 = Pattern.compile("c=");
    private static Pattern pattern2 = Pattern.compile("c-");
    private static Pattern pattern3 = Pattern.compile("dz=");
    private static Pattern pattern4 = Pattern.compile("d-");
    private static Pattern pattern5 = Pattern.compile("lj");
    private static Pattern pattern6 = Pattern.compile("nj");
    private static Pattern pattern7 = Pattern.compile("s=");
    private static Pattern pattern8 = Pattern.compile("z=");*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        List<Pattern> patternList = new ArrayList<>();
        patternList.add(Pattern.compile("c="));
        patternList.add(Pattern.compile("c-"));
        patternList.add(Pattern.compile("dz="));
        patternList.add(Pattern.compile("d-"));
        patternList.add(Pattern.compile("lj"));
        patternList.add(Pattern.compile("nj"));
        patternList.add(Pattern.compile("s="));
        patternList.add(Pattern.compile("z="));
        int matchCount = 0;
        for(Pattern pattern : patternList) {
            Matcher match = pattern.matcher(input);

            while(match.find()) {
                matchCount++;
            }
        }
        System.out.println(input.length() - matchCount);
    }
}
