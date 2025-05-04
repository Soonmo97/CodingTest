class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        for (int item : arr) {
            sum += item;
        }
        return (double)sum / arr.length;
    }
}