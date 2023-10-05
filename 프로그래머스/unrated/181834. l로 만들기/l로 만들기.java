class Solution {
    public String solution(String myString) {
        char[] arr = myString.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if((int)arr[i] < (int)'l') arr[i] = 'l';
        }
        String answer = String.valueOf(arr);
        return answer;
    }
}