class Solution {
    public int solution(int a, int b) {
        String ab = Integer.toString(a) + Integer.toString(b);
        String ba = Integer.toString(b) + Integer.toString(a);
        int answer = 0;
        if (Integer.parseInt(ab) > Integer.parseInt(ba)) {
            answer += Integer.parseInt(ab);
            return answer;
        } else {
            answer += Integer.parseInt(ba);
            return answer;
        }
        
    }
}