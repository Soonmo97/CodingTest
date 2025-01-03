import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> li = new ArrayList<Integer>();
        li.add(n);
        while(n!=1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            li.add(n);
        }
        
        int[] answer = new int[li.size()];
        
        int index = 0;
        for (Integer i : li) {
            answer[index++] = i;
        }
        
        return answer;
    }
}