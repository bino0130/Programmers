import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor == 0) {
                list.add(arr[i]);
            } else if (arr[i]%divisor != 0) {
                cnt++;
            }
        }
        
        if(cnt == arr.length) list.add(-1);
        
        Collections.sort(list);
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}