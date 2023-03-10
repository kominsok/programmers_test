import java.util.Arrays;

public class Test07 {
    
    public void run(){
        String my_str = "abc1Addfggg4556b";
        int n = 6;

        System.out.println(Arrays.toString(this.solution(my_str, n)));


        my_str = "abcdef123";
        n = 3;
        System.out.println(Arrays.toString(this.solution(my_str, n)));
    }

    /*
    "abc1Addfggg4556b"	6	["abc1Ad", "dfggg4", "556b"]
    "abcdef123"	3	["abc", "def", "123"]
     */
    public String[] solution(String my_str, int n) {
        
        int loopCnt = my_str.length() / n;
        int mod = my_str.length() % n;

        if (mod > 0 ){
            loopCnt++;
        }
        String[] answer = new String[loopCnt];

        for (int i = 1; i <= loopCnt; i++){

            int startIdx = ((i - 1) * n);
            int endIdx = i * n;

            if (endIdx > my_str.length()){
                endIdx = my_str.length();
            }

            String subMyStr = my_str.substring(startIdx, endIdx);

            answer[i - 1] = subMyStr;
            System.out.println(subMyStr);
        }

        return answer;
    }
}
