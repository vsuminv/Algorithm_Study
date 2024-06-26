class Solution {
    public String solution(String n_str) {
        String answer = "";
        String answer1 = "";
        Character[] a = new Character[n_str.length()];
        for(int i=0;i<n_str.length();i++){
            a[i]=n_str.charAt(i);
        }
        boolean b =true;
        for(int i=0;i<n_str.length();i++){

            if(a[i]!='0'|| !b){
                answer+=a[i];
                b=false;
            }

        }
        return answer;
    }
}
