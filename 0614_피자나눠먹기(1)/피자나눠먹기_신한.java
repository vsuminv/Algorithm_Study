package teamTask.Algorithm_Study.day_0614;
/* 머쓱이네 피자는 7조각으로 자름.
     피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자판 몇개 시켜야됨?
         int 피자나눠주기메서드(int 사람수){
        final int 피자조각수 = 7;
        int 피자판수;
        return 피자판수 = ((사람수%피자조각수 == 0) ? (사람수/피자조각수) : (사람수/피자조각수)+1);
    }
    */
import static java.lang.System.out;
public class 피자나눠먹기_신한 {
    public static void test(String[] args) {
        out.println(solution((10)));
    }
    static int solution(int n) {
        return n % 7 == 0 ? n / 7 : (n / 7) + 1;
    }
}

