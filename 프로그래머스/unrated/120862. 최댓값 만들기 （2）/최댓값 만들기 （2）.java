import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int cnt = 0;
        
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 0) cnt++;
        }
        
        if(cnt % 2 == 0) {           
            Arrays.sort(numbers);
            
            int a = numbers[numbers.length - 2] * numbers[numbers.length - 1];
            int b = numbers[0] * numbers[1];
            
            if(a >= b) answer = a;
            else answer = b;
            
        } else if (cnt % 2 != 0) {
            Arrays.sort(numbers);
            answer = numbers[numbers.length - 2] * numbers[numbers.length - 1];
        }
        
        
        return answer;
    }
}