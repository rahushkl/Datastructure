package org.java.practice;

//import java.util.HashMap;

public class Trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String str1 = "tutorials point", str2 = "http://";

		   CharSequence cs1 = "int";
		   // HashMap<String, String> book = new HashMap<String, String>();
		   // string contains the specified sequence of char values
		   boolean retval = str1.contains(cs1);
		   System.out.println("Method returns : " + retval);
		    
		   // string does not contain the specified sequence of char value
		   retval = str2.contains("t://");   
		   System.out.println("Methods returns: " + retval);

	}

}
