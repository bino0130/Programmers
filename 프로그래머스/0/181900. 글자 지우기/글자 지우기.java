import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String[] strArr = my_string.split("");
        
        for(int i=0; i<indices.length; i++) {
            strArr[indices[i]] = "";
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(String str : strArr) {
            sb.append(str);
        }

        return sb.toString();
        // String[] strArr = [a,b,c,d,e,f,g,h,i,j,k,l];
        // int[] indices = [0, 1, 3, 6, 10, 11, 15, 16];
    }
}