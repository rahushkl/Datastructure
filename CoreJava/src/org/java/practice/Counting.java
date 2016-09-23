package org.java.practice;
import java.util.Scanner;

public class Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userinput = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String str = userinput.nextLine();
		StringBuilder str1 = StringMan(str);
		if(str1.length()<str.length())
		{
			System.out.println(str1);
		}
		else
		{
			System.out.println(str);
		}
		userinput.close();
	}
	static StringBuilder StringMan(String str)
	{
		int length = str.length();
		StringBuilder str1 = new StringBuilder("");
		int count = 1;
		char main = str.charAt(0);
		for(int i = 1;i<length;i++)
		{
			char ht = str.charAt(i);
			if(main == ht)
			{
				count++;
			}
			else
			{
				str1.append(main);
				str1.append(count);
				main = str.charAt(i);
				count = 1;
			}
		}
		str1.append(main);
		str1.append(count);
		
		return str1;
	}
}
