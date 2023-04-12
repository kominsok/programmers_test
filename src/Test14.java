import java.util.Arrays;

public class Test14 {

    /*
     * OX퀴즈
     *  'X [연산자] Y = Z'
     * quiz	result
       ["3 - 4 = -3", "5 + 6 = 11"]	["X", "O"]
       ["19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"]	["O", "O", "X", "O"]
     */
    public void run(){
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
        System.out.println(Arrays.toString(this.solution(quiz)));

        String[] quiz2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        System.out.println(Arrays.toString(this.solution(quiz2)));
    }

    
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++){
            

            //띄어쓰기 기준으로 분리
            String[] quizItemArr = quiz[i].split(" ");
            int var1 = 0;
            int var2 = 0;
            int varResult = 0;

            if (quizItemArr[1].equals("+")){
                var1 = Integer.parseInt(quizItemArr[0]);
                var2 = Integer.parseInt(quizItemArr[2]);
                varResult = var1 + var2;

                
            }
            else if(quizItemArr[1].equals("-")){
                var1 = Integer.parseInt(quizItemArr[0]);
                var2 = Integer.parseInt(quizItemArr[2]);
                varResult = var1 - var2;              
            }

            int result = Integer.parseInt(quizItemArr[4]);

            if (varResult == result){
                answer[i] = "O";
            }
            else{
                answer[i] = "X";
            }
        }


        return answer;
    }
}
