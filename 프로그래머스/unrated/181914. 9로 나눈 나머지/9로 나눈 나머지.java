class Solution {
    public int solution(String number) {
        int answer = 0;
        char[] arr = number.toCharArray();
        //long numA = Long.parseLong(number);
        int numB = 0;
        for(char ch : arr) {
            numB += Character.getNumericValue(ch);
        }
        numB = numB % 9;
        return numB;
    }
}