class Solution {
    public String solution(String rsp) {
        char[] rspArr = rsp.toCharArray();
        for(int i = 0; i < rspArr.length; i++) {
            if(rspArr[i] == '2') {
                rspArr[i] = '0';
            } else if(rspArr[i] == '0') {
                rspArr[i] = '5';
            } else if (rspArr[i] == '5') {
                rspArr[i] = '2';
            }
        }
        return String.valueOf(rspArr);
    }
}