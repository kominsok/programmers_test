import java.lang.reflect.Method;
import java.util.*;;

public class App {
    public static void main(String[] args) throws Exception {
        
        //2022.2.2 study
		try {			
			Scanner sc = new Scanner(System.in);
        	System.out.println("실행할 Test 번호를 입력하세요.");
			
			String classNum = sc.nextLine();
			if (classNum.length() == 1) {
				classNum = "0" + classNum;
			}
			String ClassName = "Test" + classNum;
			
			Class<?> runClass = Class.forName(ClassName);
			Object tmpObj = runClass.getDeclaredConstructor().newInstance();
			Method run = runClass.getDeclaredMethod("run");
			run.invoke(tmpObj);

			sc.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
