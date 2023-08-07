class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int variable : array) {
            if(variable > height) answer++;
        }
        return answer;
    }
}