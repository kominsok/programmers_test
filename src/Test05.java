public class Test05 {
    public void run(){
        int num = 3;
        int total = 12;
        System.out.println("sol 1 : " + this.print(this.solution(num, total)));

        num = 5;
        total = 15;
        System.out.println("sol 1 : " + this.print(this.solution(num, total)));

        num = 4;
        total = 14;
        System.out.println("sol 1 : " + this.print(this.solution(num, total)));

        num = 5;
        total = 5;
        System.out.println("sol 1 : " + this.print(this.solution(num, total)));
    }

    private String print(int[] retVar){
        String tmp = "";
        
        for (int i = 0; i < retVar.length; i++){
            tmp = tmp + retVar[i] + ",";
        }

        if (!tmp.equals("")){
            tmp = tmp.substring(0, tmp.length() - 1);
            tmp = "[" + tmp + "]";
        }

        return tmp;
    }

    /*
    1 ≤ num ≤ 100
    0 ≤ total ≤ 1000
    num개의 연속된 수를 더하여 total이 될 수 없는 테스트 케이스는 없습니다.
     */    
    public int[] solution(int num, int total) {
        // x + (x + 1) + (x + 2) + .... + (x + (num-1)) = total
        // (num * x) + (1 + 2 + 3 + .... + (num - 1)) = total
        // x = (total - (1 + 2 + 3 + .... + (num - 1))) / num
        // ex) num 이 3이고 total 이 12일 떄 x는 : (12 - (1 + 2)) / 3 = 3

        int tmpNum = 0;
        for (int i = 1; i < num; i++){
            tmpNum = tmpNum + i;
        }

        int x = ((total - tmpNum) / num);

        int[] answer = new int[num];
        for(int i = 0; i < num; i++){
            answer[i] = x + i;
        }

        return answer;
    }
}
