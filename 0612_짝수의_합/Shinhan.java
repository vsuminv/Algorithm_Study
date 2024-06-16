package teamTask.Algorithm_Study.day_0612;

import java.util.Arrays;
import java.util.Objects;

public class Shinhan {
    //int num = math.random();이 주어질 때.
    //1.짝수의 합
    //2.홀수의 합
    //3.각각
    public static void main(String[] args) {
        Shinhan test = new Shinhan();


//        피자나눠먹기_신한.solution1(num);


        System.out.println(test.solution2FirstTry(5));
        System.out.println(Arrays.toString(test.solution3(5)));
    }

    int solution1(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i += 2) {
            answer += i;
        }
        return answer;
    }

    int solution2FirstTry(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i++) {
            if (i%2 != 0) {
                answer += i;
            }
        }
        return answer ;
    }

    int[] solution3(int n) {
        int oddSum = 0;
        int evenSum = 0;
        int[] answer = new int[2];

        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                oddSum += i;
            }
        }
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        answer[0] = oddSum;
        answer[1] = evenSum;
        return answer;
    }
    int[] solution3Another(int n) {
        int odd = 0;
        int even = 0;
        int oddsum =0;
        int evensum =0;
        int[] answer = new int[2];


        answer[0]  = n % 2 != 0 ? odd : even;
        answer[1]  = n % 2 == 0 ? odd : even;
        if (answer[0] != 0) {
            for (int i = 0; i <= n; i++) {
                oddsum += i;
            }
        }
        return answer;
    }

}


