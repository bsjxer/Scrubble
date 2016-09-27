package Scrubble;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutput {

	public static void main(String[] args) {
		FileInputStream in ;
		FileOutputStream out;
		
		try {
			in = new FileInputStream( "0763706205_1[1].jpg");
			out = new FileOutputStream( "0763706205_1[1].back.jpg");
		} catch ( FileNotFoundException ex ) {
			System.out.println( ex );
		} 
	}

}
