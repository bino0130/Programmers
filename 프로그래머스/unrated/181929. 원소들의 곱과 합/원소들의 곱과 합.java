class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1; int plusmul = 0;
        for(int i = 0; i < num_list.length; i++) {
            mul *= num_list[i];
            plusmul += num_list[i];
        }
        plusmul = plusmul * plusmul;
        if(mul < plusmul) answer = 1;
        else if(mul > plusmul) answer = 0;
        return answer;
    }
}