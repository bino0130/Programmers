import java.util.*;
class Solution {
    public List<String> solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        for(String str : strArr) {
            if(!(str.contains("ad"))) list.add(str);
        }
        
        return list;
    }
}