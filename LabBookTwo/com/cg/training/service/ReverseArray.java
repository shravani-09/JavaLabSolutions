/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cg.training.service;

import java.util.Arrays;

/**
 *
 * @author LENOVO
 */
public class ReverseArray {
    
    
    public static void reverseArray(int a[], int n)
    {
      
        int i, k, t; 
        for (i = 0; i < n / 2; i++) { 
            t = a[i]; 
            a[i] = a[n - i - 1]; 
            a[n - i - 1] = t; 
        } 
  
        /*printing the reversed array*/
        System.out.println("Reversed array is: \n"); 
        for (k = 0; k < n; k++) { 
            System.out.println(a[k]); 
        } 
        System.out.println("Sorted array: \n"); 
        Arrays.sort(a);
        for (k = 0; k < n; k++) { 
            System.out.println(a[k]); 
        } 
    }
}
