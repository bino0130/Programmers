class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            j += arr[i];
        }
        answer = (double)j / arr.length;
        return answer;
    }
}