import java.util.*;
class Solution {
    public List<Integer> solution(String myString) {
        List<Integer> list = new ArrayList<>();
        for(String str : myString.split("x")) {
            list.add(str.length());
        }
        if(myString.charAt(myString.length() - 1) == 'x') list.add(0);
        return list;
    }
}