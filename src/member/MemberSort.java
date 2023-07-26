package member;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class MemberSort implements Member {

	@Override
	public void execute(List<MemberDTO> list) throws FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("***********************");
			System.out.println("    1. 나이로 내림차순");
			System.out.println("    2. 이름으로 오름차순");
			System.out.println("    3. 이전 메뉴");
			System.out.println("***********************");
			System.out.print  ("    번호 : ");
			num = scan.nextInt();
			
			if(num ==3 ) break;
			if(num ==1 ) {
				Collections.sort(list);
			}else if(num == 2) {
				Comparator<MemberDTO> com = new Comparator<MemberDTO>() {

					@Override
					public int compare(MemberDTO s1, MemberDTO s2) {
						return s1.getName().compareTo(s2.getName());
					}
				};
				
				Collections.sort(list, com);
			}//if
			
			//출력
			for(MemberDTO memberDTO : list) {
				System.out.println(memberDTO);
			}
			
		}//while

	}
}
