import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {   
        Arrays.sort(score);  // 오름차순 정렬
        int answer = 0;
        int n = score.length;

        // 뒤에서부터 m개씩 묶어서 최소값 * m 더하기
        for (int i = n - m; i >= 0; i -= m) {
            answer += score[i] * m;  // score[i]는 현재 상자에서 가장 낮은 점수
        }

        return answer;
    }
}