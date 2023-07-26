package member;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MemberMain {
	
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		MemberService memberService = new MemberService();
		memberService.menu();
		System.out.println("프로그램을 종료합니다.");
	}
}
