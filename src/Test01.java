
/*
 * 개인정보 수집 유효기간
 */
public class Test01 {
	public void run(){	
		//String tmp = test01.dateMinus("2020-01-01", "20");
		
		String today1 = "2022.05.19";
		String[] terms1 = {"A 6", "B 12", "C 3"};
		String[] privacies1 = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		int[] sol1 = this.solution(today1, terms1, privacies1);
		
		System.out.println("[prb 1]");
		for (int i = 0; i < sol1.length; i++) {
			System.out.print(sol1[i] + " ");
		}
		
		System.out.println("\r\n-----------");
		
		System.out.println("[prb 2]");
		String today2 = "2020.01.01";
		String[] terms2 = {"Z 3", "D 5"};
		String[] privacies2 = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
		int[] sol2 = this.solution(today2, terms2, privacies2);
		
		for (int i = 0; i < sol2.length; i++) {
			System.out.print(sol2[i] + " ");
		}
	}

    /*
	 * 입력 : "2022.05.19", ["A 6", "B 12", "C 3"], ["2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"]
	 * 출력 : [1, 3]
	 */
	public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        
        //한달은 최대 28일
        
        //개인정보 항목별 loop
        for(int i = 0; i < privacies.length; i++){
            String privacyDate =  privacies[i].substring(0, 10);
            String privacyTermCode =  privacies[i].substring(11, 12);
            //System.out.println(privacyDate + " "+ privacyTerm);
            
            //개인정보 유효기간 loop
            for(int j = 0; j < terms.length; j++) {
            	String termCode = terms[j].substring(0, 1);
            	String termMonth = terms[j].substring(2, terms[j].length());
            	
            	//System.out.println(termCode + " " + termDay);
            	
            	
            	//약관 찾아 유효기간 비교
            	if (privacyTermCode.equals(termCode)) {
            		
            		//현재일에서 term 일자 만큼 마이너스
            		String minusDate = dateMinus(today, termMonth);
            		            		
            		//유효기간 지난 경우 answer 에 추가
            		if (dateDiff(minusDate, privacyDate)) {
            			
            			//임시 배열을 만들어 추가할 값 할당 후 answer 에 전환
            			int[] tempArr = new int[answer.length + 1];
            			
            			for(int k = 0; k < answer.length; k++) {
            				tempArr[k] = answer[k];
            			}
            			
            			tempArr[tempArr.length - 1] = i + 1;
            			
            			answer = tempArr;
            		}
            	}

            }
        }

        return answer;
    }
	
	/*
	 * 월 계산 
	 */
	public String dateMinus(String today, String termMonth) {
		String retDate = "";
		
		
		int year = Integer.parseInt(today.substring(0, 4));
		int month = Integer.parseInt(today.substring(5, 7));
		int day = Integer.parseInt(today.substring(8, 10));
		
		//System.out.println(year + " " + month + " " +date);
		
		int termMonthInt = Integer.parseInt(termMonth);
		int yearTerm = termMonthInt/12;
		int monthTerm = termMonthInt%12;
		
		int minusMonth = month - monthTerm;
		
		year = year - yearTerm;
		if (minusMonth < 1) {
			year--;
			month = 12 + minusMonth;
		}
		else {
			month = minusMonth;
		}
		
		
		if(month < 10) {
			retDate = String.valueOf(year) + ".0" + String.valueOf(month);
		}
		else {
			retDate = String.valueOf(year) + "." + String.valueOf(month);
		}
		if(day < 10) {
			retDate = retDate + ".0" + String.valueOf(day);
		}
		else {
			retDate = retDate + "." + String.valueOf(day);
		}
		//System.out.println(today + "^" + termMonth + "^" + retDate);
		
		return retDate;
	}

	
	/*
	 * 날짜 비교
	 */
	public boolean dateDiff(String minusDate, String privacyDate) {
		boolean retBool = false;
		
		int minusYear = Integer.parseInt(minusDate.substring(0, 4));
		int minusMonth = Integer.parseInt(minusDate.substring(5, 7));
		int minusDay = Integer.parseInt(minusDate.substring(8, 10));
		
		int privacyYear = Integer.parseInt(privacyDate.substring(0, 4));
		int privacyMonth = Integer.parseInt(privacyDate.substring(5, 7));
		int privacyDay = Integer.parseInt(privacyDate.substring(8, 10));
		
		
		if (minusYear > privacyYear) {
			retBool = true;
			return retBool;
		}
		else if (minusYear == privacyYear) {
			//같은 연도일 때 월 비교
			if (minusMonth > privacyMonth) {
				retBool = true;
				return retBool;
			}
			else if(minusMonth == privacyMonth) {
				//같은 월일 때 일 비교
				if (minusDay >= privacyDay) {
					retBool = true;
					return retBool;
				}
			}
		}
		
		return retBool;
	}
}
