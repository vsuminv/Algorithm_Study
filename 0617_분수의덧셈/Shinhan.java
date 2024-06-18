
class ShinHan {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int n = numer1 * denom2 + numer2 * denom1;
        int d = denom1 * denom2;
        
        int g = gcdFunc(numer,denom);

        
        int[] answer = new int[2];
        answer[0] = numer / g;
        answer[1] = denom / g;

        return answer;
    }

    private static int gcdFunc(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1 % n2);
    }
}

