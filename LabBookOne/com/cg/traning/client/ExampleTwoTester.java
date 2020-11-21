/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cg.traning.client;

import com.cg.traning.service.TrafficLight;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ExampleTwoTester {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TrafficLight trafficLight= new TrafficLight();
        
        System.out.println("Enter your choice Green/Red/Yellow");
        String choice=sc.nextLine();
        
        //instance method need object of class to invoke it
                            //objectName.methodName(parameter)
        System.out.println(trafficLight.showTrafficSignals(choice));
        
        
    }
}
