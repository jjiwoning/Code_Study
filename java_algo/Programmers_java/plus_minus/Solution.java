package Programmers_java.plus_minus;

public class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if(signs[i] == true){
                answer += absolutes[i];
                continue;
            }
            answer -= absolutes[i];
        }
        return answer;
    }
}