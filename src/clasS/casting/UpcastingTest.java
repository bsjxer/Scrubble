package clasS.casting;

import clasS.abstracT.Person;
import clasS.abstracT.Student;

public class UpcastingTest {
	public static void main(String[] args){
	    
	     Student s = new Student("안대혁" );
	     Person p = s;
	    
	     System.out.println( p.getName() );
	    // p.setGrade( "A"  );    
//	  
	  }
}
