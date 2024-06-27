import java.util.*;
class Solution {
    public ArrayList solution(int[] num_list) {
        ArrayList<Integer> answer = new ArrayList();
        
        int a = num_list[num_list.length - 1];  
        int b = num_list[num_list.length - 2];
        
        for(int i= 0; i<num_list.length; i++){
            answer.add(num_list[i]);
        }
        if(a>b){
            answer.add(a-b);
        }else
            answer.add(a * 2);
        
        return answer;
    }
}
