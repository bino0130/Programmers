import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        if(arr.length == 1) list.add(-1);
        else {
            for(int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
            }
            list.remove(list.indexOf(Collections.min(list)));
        }
        return list;
    }
}