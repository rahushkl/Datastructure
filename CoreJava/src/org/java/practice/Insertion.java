package org.java.practice;

import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userinput = new Scanner(System.in);
		System.out.println("Please enter the string:");
		String str = userinput.nextLine();
		String ch = Spacecheck(str);
		System.out.println(ch);
		userinput.close();

	}
	static String Spacecheck(String str)
	{
		int length = str.length();
		System.out.println(length);
		for(int i = 0;i<length;i++)
		{
			if(length>1)
			{
			if(str.charAt(i)==' ')
			{
				str = str.substring(0,i)+"%20"+ Spacecheck(str.substring(i+1));
			}
			}
			else
			{
				;
			}
		}
		return str;
	}

}
