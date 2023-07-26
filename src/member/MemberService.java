package member;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberService {
	private List<MemberDTO> list = new ArrayList<MemberDTO>();

	public void menu() throws FileNotFoundException, ClassNotFoundException, IOException {
		Scanner scan = new Scanner(System.in);
		Member member = null;
		int num;
		while(true) {
			System.out.println("**************");
			System.out.println("    1.등록");
			System.out.println("    2.출력");
			System.out.println("    3.핸드폰 번호 검색");
			System.out.println("    4.오름차순 정렬");
			System.out.println("    5.파일 저장");
			System.out.println("    6.파일 읽기");
			System.out.println("    7.끝");
			System.out.println("**************");
			System.out.print("     번호: ");
			num = scan.nextInt();
			if(num == 7) break; // 부모로 접근하고 new 자식으로 생성하면 부모 = 자식. 아니면 다중으로 메모리 사용되서 안됨.
			if(num == 1) member = new MemberInsert(); // 부모 = new 자식
			else if (num == 2) member = new MemberPrint();
			else if (num == 3)member = new MemberSearch();
			else if (num == 4)member = new MemberSort();
			else if (num == 5)member = new MemberFileOutput();
			else if (num == 6)member = new MemberFileInput();
			
			member.execute(list);
			
		}	// while
	}
}
