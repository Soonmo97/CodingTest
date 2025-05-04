class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        char[] c = s.toCharArray();
        if (s.length() == 4 || s.length() == 6) {
            for (char item : c) {
                int n = (int)item;
                if (n >= 48 && n <= 57) {
                    answer = true;
                } else {
                    answer = false;
                    break;
                }
            }
        }  
        
        return answer;
    }
}