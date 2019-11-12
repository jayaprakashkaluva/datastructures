package com.stack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  Stack s = new StackUsingLinkedList();
          s.push(1);
          s.push(2);
          System.out.println(s.getSize());
          s.display();
    }
}
