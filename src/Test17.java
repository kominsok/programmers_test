import java.util.Arrays;

public class Test17 {
    /*
    양의 정수 n이 매개변수로 주어집니다. n × n 배열에 1부터 n2 까지 정수를 인덱스 [0][0]부터 시계방향 나선형으로 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요

        n	result
        4	[[1, 2, 3, 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7]]
        5	[[1, 2, 3, 4, 5], [16, 17, 18, 19, 6], [15, 24, 25, 20, 7], [14, 23, 22, 21, 8], [13, 12, 11, 10, 9]]
     */

    public void run(){
        int n = 4;
        System.out.println(Arrays.deepToString(this.solution(n)));

        n = 5;
        System.out.println(Arrays.deepToString(this.solution(n)));
    }

    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int counter = 1;
        int dept = 0;

        while(counter <= (n * n)){
            //n == 4
            int sttPoint = dept;            //0->1
            int endPoint = n - dept - 1;       //3->2

            int i = 0;


            //→ [0, 0] = 1, [0, 1] = 2, [0, 2] = 3, [0, 3] = 4
            for (i = sttPoint ; i <= endPoint; i++){
                answer[sttPoint][i] = counter;
                counter++;
            }

            //↓ [0, 3] = 4, [1, 3] = 5, [2, 3] = 6, [3, 3] = 7
            counter--;
            for (i = sttPoint ; i <= endPoint; i++){
                answer[i][endPoint] = counter;
                counter++;
            }
            
            //← [3, 3] = 7, [3, 2] = 8, [3, 1] = 9, [3, 0] = 10
            counter--;
            for (i = endPoint ; i >= sttPoint; i--){
                answer[endPoint][i] = counter;
                counter++;
            }

            //↑ [3, 0] = 10, [2, 0] = 11, [1, 0] = 12
            counter--;
            for (i = endPoint ; i > sttPoint; i--){
                answer[i][sttPoint] = counter;
                counter++;
            }

            dept++;
        }
        return answer;
    }
}
