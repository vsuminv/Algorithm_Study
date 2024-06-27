class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int[] a = num_list;
        for(int i=0;i<num_list.length;i++){
            answer[i] = num_list[i];
            if(a[num_list.length-1]>a[num_list.length-2]){
              
               answer[num_list.length] = a[num_list.length-1] - a[num_list.length-2];
            }
            else {
                
                answer[num_list.length] =a[num_list.length-1]*2;
            
            }
            
    }
        
        return answer;
    }
}
