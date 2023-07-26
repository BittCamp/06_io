package io_;//[ 김찬영  2023-07-26 오후 03:35:02 ]

import java.io.File; // 전부다 자바 IO에 들어있다.
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("data.txt")));
		
//		System.out.println(bis.read());
//		System.out.println(bis.read());
//		System.out.println(bis.read());
		
		int data;
		while( (data=bis.read()) != -1 ) {  // 아무것도 안나오면 -1임.
			//System.out.print(data); 아스키로 읽는다.
			System.out.print((char)data); //문자로 읽으면
		}//while
		bis.close();
		// 13 하고 10 은 엔터다. \r \n 엔터의 기능이다.
		
	}
}
