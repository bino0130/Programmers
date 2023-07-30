class Solution {
    public static int solution(long num) {
        int cnt = 1;
        return Collatz(num, 1);
    }
    
    public static int Collatz(long num, int cnt) {
    	if(num == 1) return 0;
    	long a = 0;
        if(num % 2 == 0) a = num / 2;
        else a = num * 3 + 1;
        
        if (a != 1) {
            if((cnt+1) == 500) return -1;
            else cnt++;
            return Collatz(a, cnt);
        } else return cnt;
    }
}