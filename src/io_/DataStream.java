package io_;//[ 김찬영  2023-07-26 오후 03:32:41 ]

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {
	public static void main(String[] args) throws IOException { // IOException 밑에 많은것들 다 예외처리 해줄수있다.
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("result.txt")); // 여기서 만든 데이터는 파일로 들어간다.	//물이 하수도 처리장으로 가는원리랑 비슷
		dos.writeUTF("홍길동");
		dos.writeInt(25);
		dos.writeDouble(185.3);
		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("result.txt"));
		String name = dis.readUTF();
		int age = dis.readInt();
		double height = dis.readInt();
		
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		System.out.println("키 = " + height);
		
		dis.close();
		
	}
}
