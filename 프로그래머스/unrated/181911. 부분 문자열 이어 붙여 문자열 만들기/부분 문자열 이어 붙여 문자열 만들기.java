class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        int i = 0;
        for(int[] arr : parts) {
        	int a = arr[0];
        	int b = arr[1] + 1;
            for(int j = i; i < my_strings.length; ) {
                answer += my_strings[j].substring(a, b);
                j++;
                if(j>i) break;
            }
            i++;
        }
        return answer;
    }
}