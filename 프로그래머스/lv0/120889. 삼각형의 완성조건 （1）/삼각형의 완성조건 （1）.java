import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 2;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < sides.length; i++) {
            list.add(sides[i]);
        }
        int max = Collections.max(list);
        list.remove(list.indexOf(max));
        if(max < list.get(0) + list.get(1)) answer = 1;
        return answer;
    }
}