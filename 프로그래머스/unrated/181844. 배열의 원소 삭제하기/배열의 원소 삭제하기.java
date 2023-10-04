import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            int a = 0;
            
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) a++;
            }
            
            if(a == 0) list.add(arr[i]);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}