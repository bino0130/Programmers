import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < num_list.length; i++) {
            list.add(num_list[i]);
        }
        Collections.sort(list);
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}