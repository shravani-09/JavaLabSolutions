
package com.cg.traning.client;

import com.cg.traning.service.FibonacciSeries;
import java.util.Scanner;


public class ExampleThreeTester {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        FibonacciSeries fs= new FibonacciSeries();
        
        
        System.out.println("enter choice method ");
        System.out.println("1. for non-recursive");
        System.out.println("2. for recursive");
        int choice= sc.nextInt();
        System.out.println("enter the value of n for nth fibonacci series ");
        int n=sc.nextInt();
        switch(choice)
        {
            case 1:
                for(int i=0; i<=n; i++)
                { 
                    System.out.print(fs.printNonRecursiveFibonacciSeries(i) + " "); 
                }
            break;
            
            case 2:
                 
                int n1=0,n2=1;
                System.out.print(n1 + " "+n2); 
                fs.printRecursiveFibonacciSeries(n-2);
                
            break;
            
            default:
                System.out.println("Invalid choice!");

        }
    }
}
