class Solution {
    public String solution(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        String answer = "";
        for (int i=0; i<charArray1.length; i++) {
            answer += charArray1[i];
            answer += charArray2[i];
        }
        return answer;
    }
}