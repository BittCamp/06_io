package member;

import java.util.List;

public class MemberPrint_T implements Member_T {

	@Override
	public void execute(List<MemberDTO> list) {
		System.out.println();
		
		for( MemberDTO memberDTO: list) {
			System.out.println(memberDTO); ///<== 이러면 주소값나옴. 그런데 toString을 오버라이딩 return name+"\t"+age+"\t"+phone+"\t"+address 하면 이렇게나옴. 
		}
	}

}
