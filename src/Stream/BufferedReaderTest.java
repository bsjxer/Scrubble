package Stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			FileReader fr = new FileReader( "./src/Stream/BufferedReaderTest.java");
			
			br = new BufferedReader( fr );
			
			String line = null;
			int index = 0;
			while ( (line = br.readLine()) != null ) {
				System.out.print( ++index );
				System.out.print(":");
				System.out.print(line);
				System.out.print("\n");
				
			}
		} catch ( IOException ex ){
			System.out.println( "error:" + ex);
		} finally {
			try {
				if( br != null ) {
					br.close();
				}
			}catch ( IOException ex ){
				System.out.println( "error:" + ex);
			}
		}
	}

}
