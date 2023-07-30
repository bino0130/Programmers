class Solution {
    public static int solution(long num) {
        int cnt = 1;
        return Collatz(num, 1);
    }

    public static int Collatz(long num, int cnt) {
    	if(num == 1) return 0;
        if(num % 2 == 0) num = num / 2;
        else num = num * 3 + 1;

        if (num != 1) {
            if((cnt+1) == 500) return -1;
            else cnt++;
            return Collatz(num, cnt);
        } else return cnt;
    }
}