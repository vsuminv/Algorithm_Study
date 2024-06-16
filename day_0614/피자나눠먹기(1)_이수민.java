package h_0612;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int answer = 0;
        int n = new Scanner(System.in).nextInt();
        if (n <= 7)
            answer = 1;
        else
            if ( n % 7 ==0)
                answer = n / 7;
            else
                answer = (n / 7) + 1;
        
        System.out.println(answer);
	}

}
