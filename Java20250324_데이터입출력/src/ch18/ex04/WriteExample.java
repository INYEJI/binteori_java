package ch18.ex04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("C:/data/test.txt");
			
			char a = 'A';
			writer.write(a);
			char b = 'B';
			writer.write(b);
			
			char[] arr = {'C','D','F'};
			writer.write(arr);
			
			writer.write("FGH");
			
			writer.flush();
			
			writer.close();
		}
			catch (IOException e) {
				e.printStackTrace();
			}
			
		}	

	}

