class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;

        int gcd = getGCD(numer, denom);

        numer = numer / gcd;
        denom = denom / gcd;

        answer[0] = numer;
        answer[1] = denom;

        return answer;
    }

    int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}