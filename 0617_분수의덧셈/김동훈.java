class Solution {
    public int[] solution(int num1, int denom1, int num2, int denom2) {
        
        int numer = num1*denom2 + num2*denom1; 
        int denom = denom1*denom2;
        
        int max = 1;
        
        for (int i =1; i<=numer && i<=denom; i++) {
            if (denom%i == 0 && numer%i == 0 ) {
             max = i; 
            }
        }
        
        numer = numer/max;
        denom = denom/max;
        
        int[] answer = {numer, denom};
        
        return answer;
    }
}
