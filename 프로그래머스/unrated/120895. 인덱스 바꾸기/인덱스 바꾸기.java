class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        char a = arr[num1];
        char b = arr[num2];
        arr[num1] = b;
        arr[num2] = a;
        return String.valueOf(arr);
    }
}