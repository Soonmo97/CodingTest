class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        char[] c = s.toCharArray();
        for (char item : c) {
            if (Character.toUpperCase(item) == 'P') p++;
            if (Character.toUpperCase(item) == 'Y') y++;
        }
        if (p != y) answer = false;
        
        return answer;
    }
}