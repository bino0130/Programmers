class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cntP = 0;
        int cntY = 0;
        String[] arr = s.toLowerCase().split("");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("p")) cntP++;
            else if(arr[i].equals("y")) cntY++;
        }
        if(cntP != cntY) answer = false;
        return answer;
    }
}
