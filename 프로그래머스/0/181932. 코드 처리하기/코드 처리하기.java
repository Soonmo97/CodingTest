class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        for (int i=0; i<code.length(); i++) {
            if (mode == 0) {
                if (code.charAt(i) != '1') {
                    if(i % 2 == 0) ret = ret.concat(Character.toString(code.charAt(i)));
                } else {
                    mode = 1;
                }
            }
            else {
                if (code.charAt(i) != '1') {
                    if(i % 2 == 1) ret = ret.concat(Character.toString(code.charAt(i)));
                } else {
                    mode = 0;
                }
            }
        }
        
        if (ret.equals("")) { 
            return "EMPTY";
        } else {
            return ret;
        }
    }
}