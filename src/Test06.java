public class Test06 {
    
    public void run(){
        String A = "hello";
        String B = "ohell";

        System.out.println(this.solution(A, B));

        A = "apple";
        B = "elppa";

        this.solution(A, B);
    }

    /*
     * "hello"	"ohell"	1
    "apple"	"elppa"	-1
    "atat"	"tata"	1
    "abc"	"abc"	0
     */
    public int solution(String A, String B) {
        int answer = 0;
        
        if (A.equals(B)){
            return answer;
        }

        String tmpA = A;
        for (int i = 0; i < A.length(); i++){
            String rightChar = tmpA.substring(tmpA.length() - 1, tmpA.length());
            String subChar = tmpA.substring(0, tmpA.length() - 1);

            tmpA = rightChar + subChar;

            //System.out.println(tmpA);

            if (tmpA.equals(B)){
                return (i + 1);
            }
        }

        answer = -1;
        return answer;
    }
}
