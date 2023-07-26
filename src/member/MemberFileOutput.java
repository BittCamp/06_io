package member;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class MemberFileOutput implements Member   {

	@Override
	public void execute(List<MemberDTO> list) throws FileNotFoundException, IOException,ClassNotFoundException  {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("member.txt")));
		
		for(MemberDTO memberDTO : list) {
			oos.writeObject(memberDTO);
			System.out.println("데이터 저장성공."+ memberDTO.toString());
		}
		oos.close();
	
		
	}

}
