class Solution {
    public int solution(int order) {
        int answer = 0;
        char[] arr = String.valueOf(order).toCharArray();
        for(char ch : arr) {
            if(ch == '3' || ch == '6' || ch == '9') answer++;
        }
        return answer;
    }
}