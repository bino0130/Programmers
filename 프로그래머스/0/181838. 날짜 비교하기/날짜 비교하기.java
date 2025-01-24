import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        try{
            
            String fstDate = "";
            String secDate = "";
        
            fstDate = Integer.toString(date1[0]) + "-" + Integer.toString(date1[1]) + "-" + Integer.toString(date1[2]);
            secDate = Integer.toString(date2[0]) + "-" + Integer.toString(date2[1]) + "-" + Integer.toString(date2[2]);
        
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        
        
            Date fd = format.parse(fstDate);
            Date sd = format.parse(secDate);
            
            if(fd.before(sd)) {
                answer = 1;
            }
            
            System.out.println(fd);
            System.out.println(sd);
        } catch(ParseException e) {
            e.printStackTrace();
        }
        
        
        /*
        if(date1[0] > date2[0]) {
            answer = 1;
        } else if(date1[0] <= date2[0]) {
            if(date1[1] > date2[1]) {
                answer = 1;
            } else if(date1[1] <= date2[1]) {
                if(date1[2] < date2[2]) {
                    answer = 1;
                }
            }
        }
        */
        
        
        
        return answer;
    }
}