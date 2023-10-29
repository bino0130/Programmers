class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String str = String.valueOf(num);
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if(Character.getNumericValue(arr[i]) == k) {
                answer = i + 1;
                break;   
            }
        }
        return answer;
    }
}