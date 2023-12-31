class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++) {
            if(divide(i) % 2 == 0) answer += i;
            else answer -= i;
        }
        return answer;
    }
    
    public int divide(int a) {
        int cnt = 0;
        for(int i = 1; i <= a; i++) {
            if(a % i == 0) cnt++;
        }
        return cnt;
    }
}