class Solution {
    public String solution(String n_str) {
        while(true) {
            if(n_str.charAt(0) == '0') {
                n_str = n_str.substring(1,n_str.length());
            }
            if(n_str.charAt(0) != '0') break;
        }
        return n_str;
    }
}