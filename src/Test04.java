/*
 * 다음에 올 숫자
 */
public class Test04 {
    public void run(){
        int[] arr1 = {1, 2, 3, 4};
        System.out.println("sol 1 : " + this.solution(arr1));

        int[] arr2 = {2, 4, 8};
        System.out.println("sol 2 : " + this.solution(arr2));
    }
    /*
     * 2 < common의 길이 < 1,000
     * -1,000 < common의 원소 < 2,000
     * common의 원소는 모두 정수입니다.
     * 등차수열 혹은 등비수열이 아닌 경우는 없습니다.
     * 등비수열인 경우 공비는 0이 아닌 정수입니다.
     * 등차 : [1, 2, 3, 4]	5
     * 등비 : [2, 4, 8]	    16
     */
    public int solution(int[] common) {
        int answer = 0;
        
        int comLen = common.length;

        // 2 < common의 길이 < 1,000
        if(comLen < 3 || comLen > 1999){
            return answer;
        }
        // -1,000 < common의 원소 < 2,000
        for(int i = 0; i < comLen; i++){
            if(common[i] < -999 || common[i] > 1999){
                return answer;
            }
        }

        int firstCom = common[0];
        int secondCom = common[1];
        int thirdCom = common[2];

        int firstDiff = secondCom - firstCom;
        int secondDiff = thirdCom - secondCom;
        

        //등차수열
        if (firstDiff == secondDiff){
            //차이 값이 0 인 경우 0으로 return
            if (firstDiff == 0){
                return secondCom;
            }
            else{
                answer = common[common.length - 1] + firstDiff;
                return answer;
            }
        }

        //등비수열
        int gcf = (secondCom / firstCom);
        if (gcf != 0){
            answer = common[common.length - 1] * gcf;
            return answer;
        }

        return answer;
    }
}
