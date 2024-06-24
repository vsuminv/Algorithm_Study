import java.util.*;

class Solution {
    public String solution(String s) {
        String[] answer = s.split("");
        Arrays.sort(answer, Collections.reverseOrder());
        String khj = "";
        for(String str : answer){
            khj += str;
        }
        
        
        return khj;
    }
}
