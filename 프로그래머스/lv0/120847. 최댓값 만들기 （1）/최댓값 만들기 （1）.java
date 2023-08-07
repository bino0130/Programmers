import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        int a = Collections.max(list);
        list.remove(list.indexOf(a));
        int b = Collections.max(list);
        answer = a * b;
        return answer;
    }
}