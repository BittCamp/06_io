package member;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MemberNameAsc implements Member_T {

	@Override
	public void execute(List<MemberDTO> list) {
		System.out.println();
		
		Comparator<MemberDTO> com = new Comparator<MemberDTO>() {
			@Override
			public int compare(MemberDTO m1, MemberDTO m2) {
				return m1.getName().compareTo(m2.getName());
			}
		};
		
		Collections.sort(list, com); //오름차순
		
		//출력
		System.out.println("이름\t나이\t핸드폰\t\t주소");
		for(MemberDTO memberDTO : list) {
			System.out.println(memberDTO);
		}//for

	}

}
