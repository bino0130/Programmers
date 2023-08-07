class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int price = n * 12000 + k * 2000;
        int service = n / 10;
        System.out.println(service);
        answer = price - service * 2000;
        return answer;
    }
}