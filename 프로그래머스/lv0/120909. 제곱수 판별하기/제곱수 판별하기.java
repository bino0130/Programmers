import java.lang.*;
class Solution {
    public int solution(int n) {
        int answer = 1;
        if(Math.sqrt(n) == (int)Math.sqrt(n)) {
            return answer;
        } else {
            return 2;
        }
    }
}