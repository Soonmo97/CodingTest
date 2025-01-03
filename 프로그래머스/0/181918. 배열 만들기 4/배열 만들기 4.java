import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i = 0;
        
        while (i < arr.length) {
            // stk가 비어 있으면 arr[i]를 추가
            if (stk.isEmpty()) {
                stk.push(arr[i]);
                i++;
            } 
            // stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 추가
            else if (stk.peek() < arr[i]) {
                stk.push(arr[i]);
                i++;
            } 
            // stk의 마지막 원소가 arr[i]보다 크거나 같으면 마지막 원소 제거
            else {
                stk.pop();
            }
        }
        
        // 스택에 남은 값을 배열로 변환하여 반환
        int[] result = new int[stk.size()];
        for (int j = 0; j < result.length; j++) {
            result[j] = stk.get(j);
        }
        
        return result;
    }
}
