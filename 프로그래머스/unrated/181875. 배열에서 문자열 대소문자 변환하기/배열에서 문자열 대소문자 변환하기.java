import java.util.*;
class Solution {
    public List<String> solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        
        for(int i = 0 ; i < strArr.length; i++) {
            if(i % 2 == 0) list.add(strArr[i].toLowerCase());
            else list.add(strArr[i].toUpperCase());
        }
        return list;
    }
}