class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int top = (numer1 * denom2) + (numer2 * denom1);
        int bottom = denom1 * denom2;
        int t = top;
        int b = bottom;
        
        while (b != 0) {
            int temp = b;
            b = t % b;
            t = temp;
        }
        
        int gcd = t;
        
        answer[0] = top / gcd;
        answer[1] = bottom / gcd;
        
        return answer;
    }
}
