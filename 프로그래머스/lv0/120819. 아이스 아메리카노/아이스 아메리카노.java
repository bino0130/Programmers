class Solution {
    public int[] solution(int money) {
        int coffee = 5500;
        int a = money / coffee;
        int b = money % coffee;
        int[] answer = {a,b};
        return answer;
    }
}