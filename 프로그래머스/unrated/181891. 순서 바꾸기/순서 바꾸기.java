import java.util.*;
class Solution {
    public List<Integer> solution(int[] num_list, int n) {
        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        
        for(int a : num_list) {
            firstList.add(a);
        }
        
        for(int i = 0; i < firstList.size(); i++) {
            secondList.add(firstList.get(i));
            if(i == n - 1) break;
        }
        
        for(int i = n; i < firstList.size(); i++) {
            answer.add(firstList.get(i));
        }
        
        for(int i = 0; i < secondList.size(); i++) {
            answer.add(secondList.get(i));
        }
        
        return answer;
    }
}