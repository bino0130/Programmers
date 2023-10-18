import java.util.*;
class Solution {
    public List<String> solution(String myString) {
        myString = "x" + myString + "x";
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        List<String> list = new ArrayList<>();
        for(String a : answer) {
            if(!(a.contains(" ")) && !(a.equals(""))) list.add(a);
        }
        return list;
    }
}