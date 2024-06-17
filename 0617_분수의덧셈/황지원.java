class Solution {
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        int numer = (numer1 * denom2) + (numer2 * denom1); //분자
        int denom = denom1 * denom2; //분모

        int gcd = calculateGCD(numer, denom); //최대공약수

        answer[0] = numer / gcd;
        answer[1] = denom / gcd;

        return answer;
    }


    //분자,분모 최대공약수 구하는 함수
    public static int calculateGCD(int numer, int denom) {    
        while(denom != 0) {
            int temp = denom;
            denom = numer % denom;
            numer = temp;
        }
        return numer;
    }

}