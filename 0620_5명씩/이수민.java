import java.util.ArrayList;
class Solution {
    public String[] solution(String[] names) {
        int index = 0;
    
        ArrayList<String> answer = new ArrayList<>();
        
        for(int i=0; i < names.length; i++){

            if (i % 5 == 0 ){
                answer.add( names[i]);
            }
            

        }
        return answer.toArray(new String[0]);
    }
}
