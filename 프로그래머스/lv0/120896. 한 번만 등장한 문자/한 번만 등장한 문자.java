import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
        	answer += arr[i];
        }
        
        for(int i = 0; i < arr.length - 1; i++) {
        	if(arr[i].contains(arr[i + 1])) {
        		answer = answer.replaceAll(arr[i], "");
        	}
        }
        return answer;
    }
}