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
public class CheckOrderOfString {
    public static boolean isAlphabaticOrder(String s)  
    {  
        // length of the string  
        int n = s.length();  
        
        // create a character array  
        // of the length of the string  
        char c[] = new char [n];  
        
        // assign the string  
        // to character array  
        for (int i = 0; i < n; i++) {  
            c[i] = s.charAt(i);  
        }  
        
        // sort the character array  
        Arrays.sort(c);  
        
        // check if the character array  
        // is equal to the string or not  
        for (int i = 0; i < n; i++)  
            if (c[i] != s.charAt(i))   
                return false;  
                
        return true;      
    }  
}
