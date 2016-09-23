package test;

import java.util.HashSet;
import java.util.Scanner;

public class StringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 1st string: ");
		String str1 = sc.nextLine();
		System.out.println("Please enter second string: ");
		String str2 = sc.nextLine();
		String[] s = str1.split(" ");
		String[] t = str2.split(" ");
		int length = s.length;
		int len = t.length;
		int k = length-len;
		HashSet<String> set = new HashSet<String>();
		int count = 0;
		String[] st = new String[k];
		for(int i = 0;i<len;i++)
		{
			set.add(t[i]);
		}
		for(int i = 0;i<length;i++)
		{
			if(set.add(s[i]))
			{
				st[count]= s[i];
				count++;
			}
		}
		for(int i = 0;i<k;i++)
		{
			System.out.println(st[i]);
		}
		sc.close();

	}

}
