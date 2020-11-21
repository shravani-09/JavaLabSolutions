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
public class PrimeNumberSeries {

          public static boolean isPrime(int n) 
            { 
            
                    if (n <= 1) 
                        return false; 


                    for (int i = 2; i < n; i++) 
                        if (n % i == 0) 
                            return false; 

                    return true; 
            } 
  

        public static void printPrime(int n) 
        { 
            for (int i = 2; i <= n; i++)  
            { 
                if (isPrime(i)) 
                    System.out.print(i + " "); 
            } 
        }       
}


