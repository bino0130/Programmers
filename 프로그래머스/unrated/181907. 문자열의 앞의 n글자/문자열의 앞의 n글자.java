class Solution {
    public String solution(String my_string, int n) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < n; i++) {
            sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
}