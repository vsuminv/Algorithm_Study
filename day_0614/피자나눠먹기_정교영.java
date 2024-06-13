package quiz;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		
		System.out.print("사람수 = ");
		var n = new Scanner(System.in).nextInt();
		int answer = 0;
        int piz = 7 ;
        int sum = n/piz;
        
        if(n>piz){
            if(n%piz == 0){
                sum= n/piz;
            answer = sum;
            
            } else {
                sum = n/piz;
                answer = sum + 1;
            }
        }else{
                answer = 1;
              
        }
        
        System.out.println(answer);
       
    }
		
	}
	        
	
	





