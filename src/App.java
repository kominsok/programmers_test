public class App {
    public static void main(String[] args) throws Exception {
        
        //2022.2.2 study
		try {			
			Test01 test01 = new Test01();
			
			//String tmp = test01.dateMinus("2020-01-01", "20");
			
			String today1 = "2022.05.19";
			String[] terms1 = {"A 6", "B 12", "C 3"};
			String[] privacies1 = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
			int[] sol1 = test01.solution(today1, terms1, privacies1);
			
			System.out.println("[prb 1]");
			for (int i = 0; i < sol1.length; i++) {
				System.out.print(sol1[i] + " ");
			}
			
			System.out.println("\r\n-----------");
			
			System.out.println("[prb 2]");
			String today2 = "2020.01.01";
			String[] terms2 = {"Z 3", "D 5"};
			String[] privacies2 = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
			int[] sol2 = test01.solution(today2, terms2, privacies2);
			
			for (int i = 0; i < sol2.length; i++) {
				System.out.print(sol2[i] + " ");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
