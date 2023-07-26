package io_;//[ 김찬영  2023-07-26 오후 03:55:49 ]

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream2 {
	public static void main(String[] args) throws IOException {
		File file = new File("data.txt");
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		int size = (int)file.length();//얘가 8바이트 앞에 애가 4바이트 무조건 왼쪽으로 타입맞춰줘서 형변환 해줘야됨. // 배열.length , 문자열.length(), 리스트.size()
		
		byte[] b = new byte[size]; // 파일의 크기만큼 배열을 잡아라.
		bis.read(b,0,size); //int java.io.BufferedInputStream.read(byte[] b, int off, int len) throws IOException
							// 원래 이렇게쓰는 형식임. read안에 하나쓰기도 3개쓰기도함.
		System.out.println(b); // 배열을 찍으면 주소가 나옴.
		System.out.println(new String(b)); // 내용이 나온다.
		
	}
}
