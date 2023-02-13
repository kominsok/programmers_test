import java.util.*;;

public class App {
    public static void main(String[] args) throws Exception {
        
        //2022.2.2 study
		try {			
			Scanner sc = new Scanner(System.in);
        	System.out.println("실행할 Test 번호를 입력하세요.");
			
			switch(sc.nextLine()){
				case "1" : 
						new Test01().run();
						break;
				case "2" : 
						new Test02().run();
						break;
				case "3" : 
						new Test03().run();
						break;
				case "4" : 
						new Test04().run();
						break;
				default :
						break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
