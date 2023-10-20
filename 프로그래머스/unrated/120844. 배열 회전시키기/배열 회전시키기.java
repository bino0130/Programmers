import java.util.*;
class Solution {
    public List<Integer> solution(int[] numbers, String direction) {
        List<Integer> list = new ArrayList<>();
        // for(int i : numbers) {
        //     list.add(i);
        // }
        if(direction.equals("right")) {
            list.add(numbers[numbers.length - 1]);
            for(int i = 0; i < numbers.length - 1; i++) {
                list.add(numbers[i]);
            }
        } else {
            for(int i = 1; i < numbers.length; i++) {
                list.add(numbers[i]);
            }
            list.add(numbers[0]);
        }
        return list;
    }
}