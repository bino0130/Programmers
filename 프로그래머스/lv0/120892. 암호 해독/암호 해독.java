import java.util.*;
class Solution {
    public String solution(String cipher, int code) {
        List<Character> list = new ArrayList<>();
        for(int i = code - 1; i < cipher.length(); i += code) {
            list.add(cipher.charAt(i));
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(Character ch : list) {
            sb.append(ch);
        }
        
        return sb.toString();
    }
}