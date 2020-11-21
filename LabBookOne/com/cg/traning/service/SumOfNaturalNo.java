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
public class SumOfNaturalNo {
    
    public static int calculateSum(int n)
    {
        int sum=0;
        for (int i=0;i<=n;i++)
        {
            if(n%3==0 || n%5==0)
            {
                
                sum=sum+n;
            }
        }
        
        return sum;
    }
    
}
