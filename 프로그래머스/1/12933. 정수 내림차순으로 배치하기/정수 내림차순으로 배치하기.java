import java.util.*;

class Solution {
    public long solution(long n) {
        // n을 문자열로 변환
        String str = String.valueOf(n);
        
        // 문자열을 char 배열로 변환
        char[] chars = str.toCharArray();
        
        // 내림차순으로 정렬
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder(String.valueOf(chars));
        sb.reverse();
        
        return Long.parseLong(sb.toString());
    }
}