/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cg.traning.service;


public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n)
        {
            if (n == 0)
               return false;
         
            while (n != 1)
            {
                if (n % 2 != 0)
                    return false;
                n = n / 2;
            }
            return true;
        }
}
