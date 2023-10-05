class Solution {
    public int solution(int hp) {
        int generalAnt = hp / 5;
        int soldierAnt = (hp - generalAnt * 5) / 3;
        int normalAnt = (hp - generalAnt * 5 - soldierAnt * 3) / 1;        
        return generalAnt + soldierAnt + normalAnt;
    }
}