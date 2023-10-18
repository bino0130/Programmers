class Solution {
    public String solution(int age) {
        String answer = "";
        String strAge = String.valueOf(age);
        char[] arr = strAge.toCharArray();
        for(char ch : arr) {
            ch = (char)(Character.getNumericValue(ch) + 97);
            System.out.println(String.valueOf(ch));
            answer += ch;
        }
        return answer;
    }
}