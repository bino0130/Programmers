import java.util.*;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        List<Integer> list = new ArrayList<>();
        for(int num : array) {
            list.add(num);
        }
        while(true) {
            if(list.size() == 1) break;
            int max = Collections.max(list);
            int min = Collections.min(list);
            list.remove(list.indexOf(max));
            list.remove(list.indexOf(min));
        }
        return list.get(0);
    }
}