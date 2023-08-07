class Solution {
    public String solution(String my_string, String letter) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < my_string.length(); i++) {
            if(!String.valueOf(my_string.charAt(i)).equals(letter)) sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
}