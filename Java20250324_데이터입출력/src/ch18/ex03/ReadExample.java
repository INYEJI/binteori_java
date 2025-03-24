package ch18.ex03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		
		String path = "c:/data/test1.db";
		
		try {
		InputStream is = new FileInputStream(path);
		
		while(true) {
			int data = is.read();
			if(data == -1 ) {
				break;
			} System.out.println();
		}
		
		is.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}

	}
}
