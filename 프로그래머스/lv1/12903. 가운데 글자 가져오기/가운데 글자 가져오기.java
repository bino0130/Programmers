class Solution {
    public String solution(String s) {
        String a = "";
        if(s.length() % 2 == 0) {
            a = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
	    } else {
            a = String.valueOf(s.charAt(s.length() / 2));
	    }
		return a;
    }
}