package clasS.casting;

import clasS.abstracT.Person;
import clasS.abstracT.Student;

public class DowncastingTest {
	public static void main(String[] args){
	    
	    Person p = new Student("안대혁" );
	    Student s = (Student)p;
	    
	    Person t = new Student();
	    
	    
	    
	    //Student tt = new Person();

	    System.out.println( s.getName() );
	    s.setGrade( "A" );    
	  }
}
