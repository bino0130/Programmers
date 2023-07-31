class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String str = "";
        for(int i = phone_number.length() - 4; i < phone_number.length(); i++) {
            answer += phone_number.charAt(i);
        }
        int a = phone_number.length() - answer.length();
        for(int i = 0; i < a; i++) {
            str += "*";
        }
        return str + answer;
    }
}