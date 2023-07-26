package member;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class MemberFileInput implements Member  {

	@Override
	public void execute(List<MemberDTO> list) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("member.txt"));
		
		for(MemberDTO memberDTO : list) {
		    memberDTO = (MemberDTO) ois.readObject();
		    //System.out.println("\t"+memberDTO.getName()+"\t"+memberDTO.getAge()+"\t"+memberDTO.getPhone()+"\t"+memberDTO.getAddress());
		    System.out.println("\t" + memberDTO.toString());
		}
		ois.close();
		
/*		File file = new File("member.txt");
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		int size = (int)file.length();
		byte[] b = new byte[size];
		bis.read(b,0,size);
		
		System.out.println(new String(b));
*/	
	  /*BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("member.txt")));
		
		int data;
		while((data=bis.read())!= -1) {
			System.out.print((char)data);
		}
		bis.close(); */
	}//execute

}
