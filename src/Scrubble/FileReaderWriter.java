package Scrubble;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) {
		FileReader re = null ;
		FileInputStream input = null ;
		
		try {
			re = new FileReader ( "5555.txt");
			
			int data = -1;
			int count = 0;
			while( (data = re.read() ) != -1 ) {
				System.out.print( (char)data );
				count++;
			}
			
			System.out.println("\n");
			System.out.println("읽은 횟수:" + count);
			System.out.println("============");
			
			input = new FileInputStream ( "5555.txt");
			
			data = -1;
			count = 0;
			while( (data = input.read() ) != -1 ) {
				System.out.print( (char)data );
				count++;
			}
			
			System.out.println("\n");
			System.out.println("읽은 횟수:" + count);
			System.out.println("============");
			
		} catch ( FileNotFoundException e) {
			System.out.println(e);
		} catch ( IOException ex ) {
			ex.getStackTrace();
		}
	}

}
