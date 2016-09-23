package org.java.practice;
//import java.util.Arrays;
import java.util.Scanner;

public class ArrayHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userinput = new Scanner(System.in);
		boolean Unique = false;
		String str;
		System.out.println("Please enter the string to be verified: ");
		str = userinput.nextLine();
		Unique = Compare(str);
		if(Unique == true)
		{
			System.out.println("The string entered is Unique.");
		}
		else
		{
			System.out.println("The string entered is not Unique.");
		}
		userinput.close();
	}
	static boolean Compare(String str){
		boolean answer = true;
		if(str.length()>128)
		{
			answer = false;
		}
		else
		{
			boolean[] cha = new boolean[256];
			for(int i = 0;i<str.length();i++)
			{
				int val = str.charAt(i);
				if(cha[val])
				{
					answer = false;
				}
				else
				{
					cha[val]= true;
				}
			}
			
		}
		return answer;
	}

}
