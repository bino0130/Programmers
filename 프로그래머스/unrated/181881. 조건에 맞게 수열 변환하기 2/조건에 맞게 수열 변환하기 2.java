class Solution {
    public static int solution(int[] arr) {
		int answer = 0;
        int cnt = 0;
        int n = 0;
        
        while(true) {
            int[] arr1 = printResult(arr, n);
            int[] arr2 = printResult(arr, n + 1);
            cnt = 0;
            for(int i = 0; i < arr1.length; i++) {
			    if(arr1[i] == arr2[i]) cnt++;
		    }
		    if(cnt == arr1.length) {
                answer = n;   
                break;
            }
            n++;
        }
        
        return answer - 1;
    }

	public static int[] printResult(int[] arr, int n) {
        int[] result = new int[arr.length];
        if(n == 0) {
        	result = arr;
        } else if(n == 1){
        	result = makeArray(arr);
        } else if (n > 1) {
        	int[] tmpArr = arr.clone();
        	int i = 0;
        	while(i >= 0) {
        		tmpArr = makeArray(tmpArr);
        		i++;
        		if(i == n) break;
        	}
        	result = tmpArr;
        }
        return result;
    }
    
    public static int[] makeArray(int[] arr) {
        int[] arrX = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {            
        	if (arr[i] % 2 == 0) {
        		if(arr[i] >= 50) {
        			arrX[i] = arr[i] / 2;
        		}
        	} else {
        		if(arr[i] < 50) {
        			arrX[i] = arr[i] * 2 + 1;
        		}
        	}
        }
        
        return arrX;
    }
}