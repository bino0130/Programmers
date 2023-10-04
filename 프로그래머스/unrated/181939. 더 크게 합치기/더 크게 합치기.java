class Solution {
    public int solution(int a, int b) {
        String A = String.valueOf(a);
        String B = String.valueOf(b);
        String C = A+B;
        String D = B+A;
        if(Integer.parseInt(C) >= Integer.parseInt(D)) return Integer.parseInt(C);
        else return Integer.parseInt(D);
        
    }
}