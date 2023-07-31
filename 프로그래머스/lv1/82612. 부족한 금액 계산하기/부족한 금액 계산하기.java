class Solution {
    public long solution(int price, long money, int count) {
        long a = 0;
        for(long i = 1; i <= count; i++) {
            a += price * i;
        }
        if(money >= a) return 0;
        else return a - money;
    }
}