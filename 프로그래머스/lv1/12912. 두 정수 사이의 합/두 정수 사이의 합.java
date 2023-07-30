class Solution {
    public long solution(long a, long b) {
        long answer = 0;
        if(a > b) {
            long tmp = a;
            a = b;
            b = tmp;
        } 
        for(; a <= b; a++) {
            answer += a;
        }
        return answer;
    }
}