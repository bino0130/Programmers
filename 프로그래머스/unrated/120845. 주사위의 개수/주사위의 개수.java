class Solution {
    public int solution(int[] box, int n) {
        int[] arr = new int[3];
        arr[0] = box[0] / n;
        arr[1] = box[1] / n;
        arr[2] = box[2] / n;
        return arr[0] * arr[1] * arr[2];
    }
}