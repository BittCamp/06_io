package member;

import java.util.List;
import java.util.Scanner;

public class MemberInsert_T implements Member_T {

	@Override
	public void execute(List<MemberDTO> list) {
		//데이터
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("나이 입력 : ");
		int age  = scan.nextInt();
		System.out.print("핸드폰 번호 입력 : ");
		String phone = scan.next();
		System.out.print("주소 입력 : ");
		String address = scan.next();
		
		MemberDTO memberDTO = new MemberDTO(name,age, phone,address);
		//생성자 생성안하면 아래와같이 쓸수도있음.
		//MemberDTO memberDTO = new MemberDTO();
//		memberDTO.setAddress(address);
//		memberDTO.setName(name);
//		memberDTO.setAge(age);
//		memberDTO.setPhone(phone);
		list.add(memberDTO);
		System.out.println("등록 완료.");
	}

}
