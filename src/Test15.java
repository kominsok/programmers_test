public class Test15 {

    /*
        정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
     * 입출력 예
        n	result
        1234	10
        930211	16
     */
    public void run(){
        int n = 1234;
        System.out.println(this.solution(n));

        n = 930211;
        System.out.println(this.solution(n));
    }

    public int solution(int n) {
        int answer = 0;

        String nStr = Integer.toString(n);

        for(int i = 0; i < nStr.length(); i++){
            answer += Integer.parseInt(nStr.substring(i, i + 1));
        }
        
        return answer;
    }
}
