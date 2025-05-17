import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        
        // 해시맵에 넣어주기
        for(int i=0; i<name.length; i++) {
            hm.put(name[i], yearning[i]);
        }
        
        for(int i=0; i<photo.length; i++) {
            int temp = 0;
            for(int j=0; j<photo[i].length; j++) {
                if(hm.containsKey(photo[i][j])) {
                    temp += hm.get(photo[i][j]);
                }
            }
            answer[i] = temp;
        }
        
        return answer;
    }
}