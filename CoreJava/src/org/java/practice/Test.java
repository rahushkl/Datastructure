package org.java.practice;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
       
        int n = in.nextInt();
        int m = in.nextInt();
        
        int count = 0;
        int[] deque = new int[n];

        for (int i = 0; i < n; i++) 
        {
            deque[i] = in.nextInt();   
        }
        int var = 0;
        for(int i = 0;i<n-m+1;i++)
            {
            HashSet<Integer> set = new HashSet<Integer>();
            int max = 0;
            for(int j = i;j<i+m;j++)
                {
                
                if(set.add(deque[j]))
                    {
                    max = max+1;
                    }
            
               }
            if(max>count)
            {
                count = max;
            }
             //System.out.println(max);
            
            }
            System.out.println(count);
            
        
    }
}

