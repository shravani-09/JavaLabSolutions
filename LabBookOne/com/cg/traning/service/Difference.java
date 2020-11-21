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
public class Difference {
     public static int difference(int n){
      
      int sumSquareN = (n * (n + 1) * (2 * n + 1)) / 6;
      
      
      int sumN = (n * (n + 1)) / 2;
      
      
      int squareSumN = sumN * sumN;
      
      
      return Math.abs(sumSquareN - squareSumN);
   }
}
