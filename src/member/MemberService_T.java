package member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberService_T {
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		Member_T member = null;
		int num;
		List<MemberDTO> list = new ArrayList<MemberDTO>(); // 부모 = 자식
		
		while(true) {
			System.out.println("**************");
			System.out.println("    1.등록");
			System.out.println("    2.출력");
			System.out.println("    3.파일 저장");
			System.out.println("    4.파일 읽기");
			System.out.println("    5.이름으로 오름차순");
			System.out.println("    6.끝");
			System.out.println("**************");
			System.out.print("     번호: ");
			
			num = scan.nextInt();
			
			if (num ==6 ) break;
			if (num ==1 ) 
				member = new MemberInsert_T(); //MemberInsert mi = new MemberInsert(); //부모 = 자식 이렇게 가자. 많은프로젝트를 해야하니.
			else if (num ==2 ) 
				member = new MemberPrint_T();
			else if (num ==3 ) 
				member = new MemberFileOutput_T();
			else if (num ==4 )
				member = new MemberFileInput_T();
			else if (num ==5 )
				member = new MemberNameAsc();//<== Comparator
			
			// 호출 어떤게 들어와도 익스큐트
			member.execute(list); 
		}//while
	}//menu
		
}
