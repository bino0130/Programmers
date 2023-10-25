import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr, int[][] intervals) {
        List<Integer> answer = new ArrayList<>();
        for(int[] Arr : intervals) {
            for(int i = Arr[0]; i <= Arr[1]; i++) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}