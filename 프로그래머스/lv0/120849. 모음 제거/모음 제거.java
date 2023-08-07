class Solution {
    public String solution(String my_string) {
        char[] chArr = my_string.toCharArray();
        for(char c : chArr) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                my_string = my_string.replace(String.valueOf(c), "");
            }
        }
        return my_string;
    }
}