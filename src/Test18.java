import java.util.Arrays;

public class Test18 {
    /*
    짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
    홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
     arr	query	result
     [0, 1, 2, 3, 4, 5]	[4, 1, 2]	[1, 2, 3]
     */
    public void run(){
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] query = {4, 1, 2};
        System.out.println(Arrays.toString(this.solution(arr, query)));
        
    }

    public int[] solution(int[] arr, int[] query) {
        
        int[] answer = arr;
        for (int i = 0; i < query.length; i++){

            //int[] tmp = slice(answer, i);
            int n = query[i];

            int j = 0;
            if ((i % 2) == 0){
                int[] ret = new int[n + 1];
                //짝수
                for(j = 0; j <= n; j++){
                    ret[j] = answer[j];
                }
                answer = ret;
            }
            else{
                int[] ret = new int[answer.length - n];
                //홀수
                int count = 0;
                for(j = n; j < answer.length; j++){
                    ret[count] = answer[j];
                    count++;
                }

                answer = ret;
            }

            
        }
        return answer;
    }

    //n 기준으로 자름
    //n 짝수 : 뒤를 자름
    //n 홀수 : 앞을 자름
    private int[] slice(int[] arr, int n){

        int i = 0;
        if ((n % 2) == 0){
            int[] ret = new int[n + 1];
            //짝수
            for(i = 0; i <= n; i++){
                ret[i] = arr[i];
            }
            return ret;
        }
        else{
            int[] ret = new int[arr.length - n];
            //홀수
            int count = 0;
            for(i = n; i < arr.length; i++){
                ret[count] = arr[i];
                count++;
            }
            return ret;
        }

        
    }
}
