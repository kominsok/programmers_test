public class Test13 {

    /*
     * 문자열안에 문자열
     * str1	str2	result
    "ab6CDE443fgh22iJKlmn1o"	"6CD"	1
    "ppprrrogrammers"	"pppp"	2
    "AbcAbcA"	"AAA"	2
     */
    public void run(){
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";

        System.out.println(this.solution(str1, str2));

        str1 = "ppprrrogrammers";
        str2 = "pppp";

        System.out.println(this.solution(str1, str2));


        str1 = "AbcAbcA";
        str2 = "AAA";

        System.out.println(this.solution(str1, str2));
    }

    public int solution(String str1, String str2) {
        int answer = 0;
        if (str1.indexOf(str2) >= 0){
            answer = 1;            
        }
        else{
            answer = 2;
        }
        return answer;
    }
}
