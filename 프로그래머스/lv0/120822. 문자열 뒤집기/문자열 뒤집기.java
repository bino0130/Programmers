class Solution {
    public String solution(String my_string) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < my_string.length(); i++) {
            sb.append(my_string.charAt(i));
        }
        String answer = sb.reverse().toString();
        return answer;
    }
}