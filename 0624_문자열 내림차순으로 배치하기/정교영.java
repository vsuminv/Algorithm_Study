import java.util.Arrays;
import java.util.Collections;
class Solution {
    public String solution(String s) {
        
        String answer = "";
        Character[] a = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            a[i] = s.charAt(i);
        }
        Arrays.sort(a,Collections.reverseOrder());
        for(int i=0;i<s.length();i++){
            answer+=a[i];
        }
            
        return answer;
    }
}
