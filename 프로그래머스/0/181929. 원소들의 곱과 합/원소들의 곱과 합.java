class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 1;
        int sum2 = 0;
        for (int i : num_list) {
            sum *= i;
            sum2 += i;
        }
        sum2 = sum2 * sum2;
        answer = (sum < sum2) ? 1 : 0;
        
        return answer;
    }
}