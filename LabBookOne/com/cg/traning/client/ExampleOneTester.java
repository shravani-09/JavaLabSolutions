/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cg.traning.client;

import com.cg.traning.service.SumOfCubes;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ExampleOneTester {

    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
// no need to create object as sumOfCubes is static method
        //        SumOfCubes sum= new SumOfCubes();
        
        
        System.out.println("enter the value of n to find sum of cubes of n natural numbers ");
        int n=sc.nextInt();
        
        System.out.println(SumOfCubes.sumOfCubes(n));
        
    }
    
}
