/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cg.traning.client;


import com.cg.traning.service.PowerOfTwo;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ExampleEightTester {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n ");
        int n=sc.nextInt();
        System.out.println(PowerOfTwo.isPowerOfTwo(n));
    }
    
}
