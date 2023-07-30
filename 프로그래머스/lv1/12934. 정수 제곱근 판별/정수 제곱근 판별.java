class Solution {
    public long solution(long n) {
        long answer = 0;
        double root = Math.sqrt(n);
        if(root == (int)root) answer = (long)(root + 1) * (long)(root + 1);
        else answer = -1;
        return answer;
    }
}