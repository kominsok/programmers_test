public class Test11 {
    //세균증식
    /*
     * 1시간에 2배씩 증식
     * n	t	result
        2	10	2048
        7	15	229,376
     */
    public void run(){
        int n = 2;
        int t = 10;

        System.out.println(this.solution(n,  t));

        n = 7;
        t = 15;

        System.out.println(this.solution(n,  t));
    }

    public int solution(int n, int t) {
        int answer = 0;

        answer = n;
        for (int i = 0; i < t; i++){
            answer = answer * 2;
        }

        return answer;
    }
}
