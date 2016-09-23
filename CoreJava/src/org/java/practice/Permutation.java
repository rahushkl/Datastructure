package org.java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userinput = new Scanner(System.in);
		System.out.println("Please enter first string: ");
		String str1 = userinput.nextLine();
		System.out.println("Please enter second string: ");
		String str2 = userinput.nextLine();
		boolean check = Checking(str1, str2);
		if(check == true)
		{
			System.out.println(" The two strings entered are permutation of each other.");
		}
		else
		{
			System.out.println("The two strings entered are not permutations of each other.");
		}
		
		userinput.close();

	}
	static boolean Checking(String str1, String str2)
	{
		
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		System.out.println(s1);
		System.out.println(s2);
		if(Arrays.equals(s1, s2))
		{
			return true;
		}
		return false;
	}

}
