class Solution {
    public long solution(int a, int b) {
        long sum = 0;
        if (a == b) return (long)a;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum += (long)i;
            }
            return sum;
        } else {
            for (int i = b; i <= a; i++) {
                sum += (long)i;
            }
            return sum;
        }
    }
}