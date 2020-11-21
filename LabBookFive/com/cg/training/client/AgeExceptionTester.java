/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cg.training.client;

import com.cg.training.exceptions.AgeException;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class AgeExceptionTester {
     public static void main(String[] args)
     {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter ur age :: ");
        int age = s.nextInt();

        try {
         if(age < 15) 
          throw new AgeException("Invalid age");
         else
          System.out.println("Valid age");
        }
        catch (AgeException a) {
         System.out.println(a);
        }
         catch(Exception ex)
        {
            ex.printStackTrace();
        }
 }
}
