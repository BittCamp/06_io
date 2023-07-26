package io_;//[ 김찬영  2023-07-26 오후 03:55:49 ]

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("result2.txt")));
		PersonDTO personDTO = new PersonDTO("홍길동", 25, 185.3);
		oos.writeObject(personDTO);
		oos.close();
		// 하나씩 보내는게 아니라 한꺼번에 다보낸다.
		
		// implements Serializable 안하면
		
		/* 이런 오류가 뜬다.
		Exception in thread "main" java.io.NotSerializableException: io_.PersonDTO
		at java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1187)
		at java.base/java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:350)
		at io_.ObjectMain.main(ObjectMain.java:13)
		*/
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result2.txt"));
		PersonDTO personDTO2 = (PersonDTO)  ois.readObject(); // <== 얘가 오브젝트 타입으로 받아온다. 그래서 PESSONDTO타입으로 변경해줘야됨.,내가원하는거 가져오려면
															//  자식 = (자식) 부모 // readObject는 ClassNotFoundException를 써줘야 쓸수있다.
		System.out.println("이름 = " + personDTO2.getName() );
		System.out.println("나이 "+ personDTO2.getAge());
		System.out.println("키 "+ personDTO2.getHeight() );
		ois.close();
	}
}
