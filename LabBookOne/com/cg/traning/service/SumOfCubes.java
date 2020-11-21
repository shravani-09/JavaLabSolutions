
package com.cg.traning.service;

public class SumOfCubes {
        
        public static int sumOfCubes(int n)
        {
            int sum=0;
            for(int i=1;i<=n;i++)
            {
            sum=sum+i*i*i;
            }
            return sum;
            
        }


    
}
