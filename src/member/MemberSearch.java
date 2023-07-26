package member;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MemberSearch implements Member {

	@Override
	public void execute(List<MemberDTO> list) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("찾고자 하는 핸드폰 번호 입력");
		String phone = scan.next();
		
		int sw = 0;
		for(MemberDTO memberDTO : list) {
			if(phone.equals(memberDTO.getPhone())) {

				  System.out.println("\t이름\t나이\t핸드폰번호\t주소");
				  System.out.println("\t"+memberDTO);
				  break;
			}//if
		}//for
	}
}
