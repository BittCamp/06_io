package member;

import java.util.List;

public class MemberPrint  implements Member {

	@Override
	public void execute(List<MemberDTO> list) {
	  System.out.println("\t이름\t나이\t핸드폰번호\t주소");
	  
	  for(MemberDTO memberDTO : list) {
		  System.out.println("\t"+memberDTO);
	  }
	}

}
