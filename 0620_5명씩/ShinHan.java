package src;

import java.util.*;

public class ShinHan {
    class Solution {
        public String[] solution(String[] names) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < names.length; i += 5) {
                list.add(names[i]);
            }
            return list.toArray(new String[0]);
        }
    }
}
