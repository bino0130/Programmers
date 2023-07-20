class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
	    	int a = 0; int b = 0;
			String[] ongal = {"aya", "ye", "woo", "ma"};

			for(int i = 0; i < babbling.length; i++) {
				for(int j = 0; j < ongal.length; j++) {                
					if(babbling[i].contains(ongal[j])) {
						babbling[i] = babbling[i].replace(ongal[j], " ").trim();
						
					}
				}
				System.out.println("원소 : " + babbling[i]);
				if(babbling[i].equals("")) answer++;
			}
			
			return answer;
    }
}