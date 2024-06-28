package src;

@SuppressWarnings("all")
public class ShinHan {
        public int[] solution(int[] num_list) {
            int[] answer = new int[num_list.length + 1];

            for(int i = 0; i < num_list.length; i++){
                answer[i] = num_list[i];
            }

            int a = num_list[num_list.length - 2];
            int b = num_list[num_list.length - 1];

            if(a < b)   answer[answer.length - 1] = b - a;
            else        answer[answer.length - 1] = b * 2;
            return answer;
        }
}
