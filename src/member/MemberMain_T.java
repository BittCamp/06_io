package member;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MemberMain_T {
	
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		MemberService_T memberService = new MemberService_T();
		memberService.menu();
		System.out.println("프로그램을 종료합니다.");
	}
}
