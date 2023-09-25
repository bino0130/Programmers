import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        String stringOdd = "";
        int odd = 0;
        
        String stringEven = "";
        int even = 0;
        
        List<String> oddList = new ArrayList<String>();
        List<String> evenList = new ArrayList<String>();
        
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                evenList.add(Integer.toString(num_list[i]));
            } else {
                oddList.add(Integer.toString(num_list[i]));
            }
        }
        
        for(int i = 0; i < evenList.size(); i++) {
            stringEven += evenList.get(i);
        }
        for(int i = 0; i < oddList.size(); i++) {
            stringOdd += oddList.get(i);
        }
        
        odd = Integer.parseInt(stringOdd);
        even = Integer.parseInt(stringEven);
        return odd + even;
    }
}