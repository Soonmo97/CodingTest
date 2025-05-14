class Solution {
    public int solution(int[] nums) {
        int count = 0;

        // 서로 다른 3개 수를 고르기 위한 조합
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    // 소수 판별 함수
    private boolean isPrime(int num) {
        if (num < 2) return false;

        // 2부터 √num까지 나눠보며 소수 판별
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}