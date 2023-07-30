import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        StringBuilder sb = new StringBuilder();
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        answer = Long.parseLong(sb.reverse().toString());
        return answer;
    }
}