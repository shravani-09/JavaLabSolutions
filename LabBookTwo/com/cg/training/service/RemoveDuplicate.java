/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cg.training.service;

/**
 *
 * @author LENOVO
 */
public class RemoveDuplicate {
    public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
    public static void sortDescendingOrder(int arr[],int n)
    {
            int temp = 0;    
            
            for (int i = 0; i < n; i++) {     
            for (int j = i+1; j < n; j++) {     
               if(arr[i] < arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }
            
        System.out.println("\nElements of array sorted in descending order: ");    
        for (int i = 0; i < n; i++) {     
            System.out.print(arr[i] + " ");    
        }    

    }
}
