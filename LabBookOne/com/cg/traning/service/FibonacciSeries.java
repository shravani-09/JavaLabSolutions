/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cg.traning.service;

/**
 *
 * @author LENOVO
 */
public class FibonacciSeries {
    
    public int printNonRecursiveFibonacciSeries(int n)
    {
   
                    if (n == 0) 
                    { 
                        return 0; 
                    } 
                    if (n == 1)
                    { 
                        return 1; 
                    } 
                    int first = 0; 
                    int second = 1; 
                    int nth = 1; 
                    for (int i = 2; i <= n; i++) 
                    { 
                        nth = first + second; 
                        first = second; 
                        second = nth; 
                    } 
                    return nth;

    }
    
    public void printRecursiveFibonacciSeries(int n)
    {              int n1=0,n2=1,n3=0;    
                    
            if(n>0){    
                    n3 = n1 + n2;    
                    n1 = n2;    
                    n2 = n3;    
                    System.out.print(" "+n3);   
                    printRecursiveFibonacciSeries(n-1);    
     }    
    }
}
