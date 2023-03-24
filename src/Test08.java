public class Test08 {

    public void run(){
        int[] array = {7, 77, 17};

        System.out.println(this.solution(array));


        int[] array2 = {10, 29};
        System.out.println(this.solution(array2));
    }

    public int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++){
            String arrayVar = Integer.toString(array[i]);
            
            for(int j = 0; j < arrayVar.length(); j++){
                if (arrayVar.substring(j, j+1).equals("7")){
                    answer++;
                }
            } 
        }
        return answer;
    }
}
