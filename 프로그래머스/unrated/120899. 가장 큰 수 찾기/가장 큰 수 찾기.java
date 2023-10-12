import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        
        answer[0] = Collections.max(list);
        answer[1] = list.indexOf(answer[0]);
        
        return answer;
    }
}