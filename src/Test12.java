public class Test12 {
    /*
     * 제곱수 판별하기
     * n	result
     *144	1
     *976	2
     */
    public void run(){
        int n = 144;

        System.out.println(this.solution(n));

        n = 976;

        System.out.println(this.solution(n));
    }

    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i < n; i++){
            if ((i * i) == n){
                answer = 1;
                break;
            }
            else if ((i * i) > n){
                answer = 2;
                break;
            }
        }
        
        return answer;
    }
}
