import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        // 결과를 저장할 ArrayList
        ArrayList<Integer> al = new ArrayList<>();
        
        // l 이상 r 이하의 모든 수에 대해 확인
        for (int i = l; i <= r; i++) {
            String numStr = String.valueOf(i);
            boolean valid = true;
            
            // 숫자 문자열을 한 문자씩 확인
            for (int j = 0; j < numStr.length(); j++) {
                // 숫자가 "0"도 아니고 "5"도 아니면 valid=false
                if (numStr.charAt(j) != '0' && numStr.charAt(j) != '5') {
                    valid = false;
                    break;
                }
            }
            
            // valid가 true이면 숫자 i는 "0"과 "5"로만 이루어진 숫자이므로 결과에 추가
            if (valid) {
                al.add(i);
            }
        }
        
        // 결과가 없다면 [-1] 반환
        if (al.isEmpty()) {
            return new int[] {-1};
        }
        
        // ArrayList를 오름차순으로 정렬
        Collections.sort(al);
        
        // 결과를 int[] 배열로 변환하여 반환
        int[] answer = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            answer[i] = al.get(i);
        }
        
        return answer;
    }
}