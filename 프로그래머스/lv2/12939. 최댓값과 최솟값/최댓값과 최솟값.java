import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            list.add(Integer.parseInt(arr[i]));
        }
        
        int max = Collections.max(list);
        int min = Collections.min(list);
        
        answer = String.valueOf(min) + " " + String.valueOf(max);
        
        return answer;
    }
}