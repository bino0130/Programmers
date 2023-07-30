class Solution {
    public static int solution(long num) {
        int cnt = 0;
        if(num == 1) return 0;
        while(true) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }
            cnt++;
            if(cnt == 500) {
                if(num != 1) return -1;
            }
            if(num == 1) return cnt;
        }
    }
}