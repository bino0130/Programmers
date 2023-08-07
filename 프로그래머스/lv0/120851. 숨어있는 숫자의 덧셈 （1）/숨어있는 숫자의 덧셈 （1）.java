class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] arr = my_string.toCharArray();
        for(char c : arr) {
            if(Character.isDigit(c)) answer += Integer.parseInt(String.valueOf(c));
        }
        return answer;
    }
}