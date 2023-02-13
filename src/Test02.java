/*
 * 옹알이 (1)
 */
public class Test02 {
    public void run(){
        String[] arr1 = {"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println("sol 1 : " + this.solution(arr1));

        String[] arr2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        System.out.println("sol 2 : " + this.solution(arr2));
    }

    public int solution(String[] babbling) {
        int answer = 0;

        String[] speakSet = { "aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length ; i++){
            String tmpBabbling = babbling[i];

            //speak set 에 포함된 단어를 *으로 치환
            for (int j = 0; j < speakSet.length; j++){
                tmpBabbling = tmpBabbling.replace(speakSet[j], "*");
            }

            //단어가 다 치환되어 전부 *인 경우 값으로 인정
            if (tmpBabbling.trim().replace("*", "").equals("")){
                answer++;
            }
        }


        return answer;
    }
}
