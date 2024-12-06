class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length]; // 각 쿼리 결과를 저장할 배열

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            int temp = Integer.MAX_VALUE; // 가장 작은 값을 찾기 위해 초기화

            for (int j = s; j <= e; j++) { // s부터 e까지 순회
                if (arr[j] > k && arr[j] < temp) { // k보다 크고 temp보다 작은 값 찾기
                    temp = arr[j];
                }
            }

            // k보다 큰 값이 없으면 -1 저장
            answer[i] = (temp == Integer.MAX_VALUE) ? -1 : temp;
        }

        return answer;
    }
}
