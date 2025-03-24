package ch18.ex02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class Person{}


public class WriteExample {

	public static void main(String[] args) {
	
		String path = "c:/data/test.db";
		
		OutputStream os = null;
		try {
			os = new FileOutputStream(path);
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush();
			
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
