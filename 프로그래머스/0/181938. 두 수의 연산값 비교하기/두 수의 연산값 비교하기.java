class Solution {
    public int solution(int a, int b) {
        String ab = Integer.toString(a) + Integer.toString(b);
        int abi = Integer.parseInt(ab);
        int abi2 = 2 * a * b;
        int answer = 0;
        
        if (abi < abi2) {
            answer += abi2;
        } else {
            answer += abi;
        }
        
        return answer;
    }
}