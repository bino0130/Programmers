class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] splitPoly = polynomial.split(" ");
        String plus = " + ";
        int xNum = 0;
        int num = 0;
        
        if(!polynomial.contains("+")) { // 항이 1개인 경우
            return polynomial;
        } else { // 항이 2개 이상인 경우
            for(int i = 0; i < splitPoly.length; i++) {
                // x의 계수 계산
                if(splitPoly[i].contains("x")) {
                    if(splitPoly[i].length() > 1) {
                        xNum += Integer.parseInt(splitPoly[i].substring(0, splitPoly[i].length() - 1));
                    } else xNum += 1;
                }
                
                // 양수 계산
                if(isInteger(splitPoly[i])) num += Integer.parseInt(splitPoly[i]);
            }
            String x = "";
            if(xNum != 0) { // x의 계수가 0이 아닐 때
                if(xNum == 1) { // x의 계수가 1인 경우 -> 1x를 x로 바꿈
                    x = "x";
                    answer = x + plus + num;
                    if(num == 0) answer = x;
                }
                else { // x의 계수가 2 이상인 경우
                    x = xNum + "x";
                    answer = x + plus + num;
                    if(num == 0) answer = x;
                }
            } else if (xNum == 0) { // x의 계수가 0인 경우
                answer = "" + num;
            }
            
            return answer;
            }
    }
    
    public boolean isInteger(String a) {
        try {
            Integer.parseInt(a);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}