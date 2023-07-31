import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr) {
        int tmp = 0;
        int[] answer = new int[arr.length];
        List<Integer> listA = new ArrayList<Integer>();
        List<Integer> listB = new ArrayList<Integer>();
        if(arr.length == 1) listA.add(-1);
        else {
            for(int i = 0; i < arr.length; i++) {
                listA.add(arr[i]);
                listB.add(arr[i]);
            }
            Collections.sort(listB);
            System.out.println(listB.indexOf(listB.get(0)));
            listA.remove(listA.indexOf(listB.get(0)));
            
        }
        return listA;
    }
}