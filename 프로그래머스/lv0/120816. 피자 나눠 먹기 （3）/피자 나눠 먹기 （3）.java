class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        if(n / slice >= 1 && n % slice != 0) answer = n / slice + 1;
        else if(n / slice >= 1 && n % slice == 0) answer = n / slice;
        else if(n / slice == 0 && n % slice != 0) answer = 1;
        else if(n / slice == 0 && n % slice == 0) answer = 0;
        return answer;
    }
}