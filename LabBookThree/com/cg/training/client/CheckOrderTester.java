/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cg.training.client;

import com.cg.training.service.CheckOrderOfString;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class CheckOrderTester {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("enter a String");
        String str=sc.nextLine();
        
        System.out.println(CheckOrderOfString.isAlphabaticOrder(str));
    }
}
