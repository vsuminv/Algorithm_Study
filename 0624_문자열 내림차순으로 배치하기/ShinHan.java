package src;

import java.util.*;

public class ShinHan {
    class Solution {
        public String solution(String s) {
            String answer = "";

            String[] arr = s.split("");

            Arrays.sort(arr, Collections.reverseOrder());

            for (String string : arr) {
                answer += string;
            }

            return answer;
        }
    }
}
