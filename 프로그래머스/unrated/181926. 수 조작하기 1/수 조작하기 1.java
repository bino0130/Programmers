class Solution {
    public int solution(int n, String control) {
        int answer = n;
        char[] chArr = control.toCharArray();
        for(char c : chArr) {
            if (String.valueOf(c).equals("w")) answer += 1;
            if (String.valueOf(c).equals("s")) answer -= 1;
            if (String.valueOf(c).equals("d")) answer += 10;
            if (String.valueOf(c).equals("a")) answer -= 10;
        }
        return answer;
    }
}