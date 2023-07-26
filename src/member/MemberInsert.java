package member;

import java.util.List;
import java.util.Scanner;

public class MemberInsert implements Member {

	@Override
	public void execute(List<MemberDTO> list) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		String name = scan.next(); 
		System.out.println("나이를 입력하세요");
		int age = scan.nextInt();
		System.out.println("핸드폰번호를 입력하세요");
		String phone = scan.next();
		System.out.println("주소를 입력하세요");
		String address = scan.next();
		
		MemberDTO memberDTO = new MemberDTO(name,age, phone,address);
		System.out.println("등록 완료.");
		list.add(memberDTO);
		System.out.println("\t"+memberDTO.toString());
	}

}
