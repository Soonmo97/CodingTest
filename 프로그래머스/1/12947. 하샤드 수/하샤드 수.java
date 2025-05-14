class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int temp = x;

        while (temp > 0) {
            sum += temp % 10; // 1의 자리 수 더하기
            temp /= 10;       // 자릿수 줄이기
        }

        return x % sum == 0;  // 하샤드 수 여부 반환
    }
}
