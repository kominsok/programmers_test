/*
 * 종이 자르기
 */
public class Test03 {

    public void run(){
        System.out.println("sol 1 : " + this.solution(2, 2));

        System.out.println("sol 2 : " + this.solution(4, 3));
    }

    public int solution(int M, int N) {
        int answer = 0;
        if (M == 1 && N == 1){
            
        }
        else{
            answer = (M - 1) + ((N - 1) * M);
        }
        return answer;
    }
}
