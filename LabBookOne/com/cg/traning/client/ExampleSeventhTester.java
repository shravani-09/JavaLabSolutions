/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cg.traning.client;

import com.cg.traning.service.CheckOrderOfDigits;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ExampleSeventhTester {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entee a digit ");
        int n=sc.nextInt();
        System.out.println(CheckOrderOfDigits.increasingDigits(n));
    }
}
