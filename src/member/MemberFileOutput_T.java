package member;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class MemberFileOutput_T implements Member_T {

	@Override
	public void execute(List<MemberDTO> list) {
		System.out.println();
		// Stream 생성
		//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("member.txt"));
		// 이렇게 멀티캐치 잡아서 사용도  됨.
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("member.txt")));
			for( MemberDTO memberDTO: list) {
				oos.writeObject(memberDTO);// 파일저장. writeObject는 덮어쓰는 형식으로 들어가고 append는 추가 하는 방식으로 계속들어간다.
			}
			oos.close();
			System.out.println("파일 저장 완료");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
