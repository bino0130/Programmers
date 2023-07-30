import java.util.*;
class Solution {
    public int[] solution(long n) {
        String[] arr = String.valueOf(n).split("");
		int[] answer = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			answer[i] = Integer.parseInt(arr[i]);
		}
		for(int j = 0; j < arr.length - 1; j++) {
			for(int i = 0; i < arr.length - 1 - j; i++) {
				int t = answer[i];
				answer[i] = answer[i + 1];
				answer[i + 1] = t;
			}
		}
        return answer;
    }
}