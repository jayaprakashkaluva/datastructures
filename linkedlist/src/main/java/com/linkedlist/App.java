package com.linkedlist;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  List s = new LinkedList();
    	  s.add(4);
    	  s.add(8);
          System.out.println(s.getSize());
          s.iterate();
    }
}
