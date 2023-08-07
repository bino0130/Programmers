import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int[] arr : lines) {
			for(int i = arr[0]; i < arr[arr.length - 1]; i++) {
				map.put(i, map.getOrDefault(i, 0) + 1);
			}
		}
		
		for(Integer num : map.keySet()) {
			if(map.get(num) > 1) answer++;
		}
		
		return answer;
    }
}