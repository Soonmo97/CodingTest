class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if (s.length() != 4 && s.length() != 6) return answer = false;
        
        char[] c = s.toCharArray();
        
        for (char item : c) {
            if (!Character.isDigit(item)) return answer = false;
        }
        
        return answer;
    }
}