import java.util.*;
class Solution {
    public List<Integer> solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++) {
            if((int)(my_string.charAt(i)) >= 48 && (int)(my_string.charAt(i)) <= 57) {
                list.add(Character.getNumericValue(my_string.charAt(i)));
            }
        }
        Collections.sort(list);
        return list;
    }
}