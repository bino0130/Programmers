class Solution {
    public String solution(String my_string, int n) {
        StringBuffer sb = new StringBuffer();
        String[] strArr = my_string.split("");
        for(int i = strArr.length - n; i < strArr.length; i++) {
            sb.append(strArr[i]);
        }
        return sb.toString();
    }
}