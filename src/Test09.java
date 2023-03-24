import java.util.Arrays;

public class Test09 {

    public void run(){
        String my_string = "Bcad";
        System.out.println(this.solution(my_string));

        my_string = "heLLo";
        System.out.println(this.solution(my_string));

        my_string = "Python";
        System.out.println(this.solution(my_string));
    }

    /*
     * 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, 
     * my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
     * my_string	result
        "Bcad"	"abcd"
        "heLLo"	"ehllo"
        "Python"	"hnopty"
     */
    public String solution(String my_string) {
        String answer = "";

        //소문자 변환
        String tmpString  = my_string.toLowerCase();

        //Char 로 변환 후 정렬
        char[] tmpStringCharArr = tmpString.toCharArray();
        Arrays.sort(tmpStringCharArr);

        answer = new String(tmpStringCharArr);

        return answer;
    }
}
