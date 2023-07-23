class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String[] arr = new String[array.length];
        for(int i = 0; i < array.length; i++) {
            String[] arr2 = String.valueOf(array[i]).split("");
            for(int j = 0; j < arr2.length; j++){
                if(arr2[j].equals("7")) answer++;
            }
        }
        return answer;
    }
}