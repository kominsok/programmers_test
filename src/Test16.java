public class Test16 {
    /*
        점 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다.

[[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해보세요.

     * 입출력 예
        dots	result
[[1, 4], [9, 2], [3, 8], [11, 6]]	1
[[3, 5], [4, 1], [2, 4], [5, 10]]	0
     */
    public void run(){
        int[][] n = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        System.out.println(this.solution(n));

        int[][] n2 = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
        System.out.println(this.solution(n2));
    }

    public int solution(int[][] dots) {
        int answer = 0;

        //기울기 공식 (y2 - y1) / (x2 - x1)
        //case
        //0-1,2-3
        //0-2,1-3
        //0-3,1-2
        
        
        //case1 : 0-1,2-3
        
        //System.out.println(dots[1][1] - dots[0][1]);
        //System.out.println(dots[1][0] - dots[0][0]);
        //System.out.println(((double)-2 / (double)8));
        double inc1 = (((double)dots[1][1] - (double)dots[0][1]) / ((double)dots[1][0] - (double)dots[0][0]));
        double inc2 = (((double)dots[3][1] - (double)dots[2][1]) / ((double)dots[3][0] - (double)dots[2][0]));
        if (inc1 == inc2){
            //System.out.println("case 1");
            answer = 1;
        }

        //case2 0-2,1-3
        //System.out.println(((double)dots[2][1] - (double)dots[0][1]));
        //System.out.println(((double)dots[2][0] - (double)dots[0][0]));
        inc1 = (((double)dots[2][1] - (double)dots[0][1]) / ((double)dots[2][0] - (double)dots[0][0]));
        inc2 = (((double)dots[3][1] - (double)dots[1][1]) / ((double)dots[3][0] - (double)dots[1][0]));
        if (inc1 == inc2){
            //System.out.println("case 2");
            answer = 1;
        }

        //case3 0-3,1-2
        inc1 = (((double)dots[3][1] - (double)dots[0][1]) / ((double)dots[3][0] - (double)dots[0][0]));
        inc2 = (((double)dots[2][1] - (double)dots[1][1]) / ((double)dots[2][0] - (double)dots[1][0]));
        if (inc1 == inc2){
            //System.out.println("case 3");
            answer = 1;
        }

        return answer;
    }
}
