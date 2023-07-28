package member;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class MemberFileInput_T implements Member_T {
	//txt파일에 저장하는게 목적이다. 
	//여기서 출력하는건 아니고 다시 파일 실행했을때 출력에서 뜨게 하는게 목적임
	@Override
	public void execute(List<MemberDTO> list) {
		System.out.println();
		list.clear(); // 리스트 안에 들어있는게 있다면 싹 다 지워버리라. 순수하게 파일안에 내용만 가져오게 하려고. ArrayList를 초기화.
		
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream("member.txt"));
		
			while(true) {
				// 파일 읽기
				try {
					//파일 읽기
					try {
						MemberDTO memberDTO = (MemberDTO)ois.readObject();
						list.add(memberDTO); // 파일에서 읽은 데이터 ArrayList에 보관
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
				}catch(EOFException e) {
					//End Of FIle
					break; // 파일 읽을게 없으면 나가라
				}
			}
			ois.close();
			System.out.println("파일 읽기 완료."); 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
