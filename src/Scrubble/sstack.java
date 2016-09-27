package Scrubble;

import java.util.Stack;

public class sstack {
	public static void main( String[] args){
		Stack stack = new Stack();
		
		stack.add( "물통");
		stack.add( "필통");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}
}
