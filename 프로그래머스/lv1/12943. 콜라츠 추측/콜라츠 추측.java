class Solution {
    public static int solution(long num) {
        if(num == 1) return 0;
        return Collatz(num, 0);
    }
    
    public static int Collatz(long num, int cnt) {
        if (num != 1 && (cnt+1) == 500) return -1;
        if(num == 1) return cnt;  
        if(num % 2 == 0) num = num / 2;
        else num = num * 3 + 1;  
        return Collatz(num, cnt + 1);
    }
}