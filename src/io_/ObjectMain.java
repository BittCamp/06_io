package io_;//[ 김찬영  2023-07-26 오후 03:55:49 ]

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectMain {

	public static void main(String[] args) throws IOException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("result2.txt")));
		PersonDTO personDTO = new PersonDTO(null, 0, 0);
	}
}
