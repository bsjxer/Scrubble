package Stream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		try {
			FileOutputStream fos = new FileOutputStream( "15555.txt" );
			
			bos = new BufferedOutputStream( fos, 5);
			
			for( int i = '0'; i < '9'; i++ ){
				bos.write(i);
				bos.flush();
			}
		} catch ( IOException ex){
			System.out.println( ex );
		} finally {
			try {
				if( bos != null){
					bos.close();
				}
			} catch ( IOException ex){
				System.out.println( "error:" + ex);
			}
		}
	}

}
