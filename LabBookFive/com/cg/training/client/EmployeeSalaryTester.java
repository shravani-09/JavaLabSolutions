/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cg.training.client;

import com.cg.training.exceptions.EmployeeSalaryException;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class EmployeeSalaryTester {
    private static double minimumSalary=3000;
    public static boolean checkSalary(double salary) throws EmployeeSalaryException
    {
        if(salary<minimumSalary)
        {
        throw new EmployeeSalaryException("Salary is below minimum limit");
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter name and salary ");
        String name=sc.nextLine();
        double salary=sc.nextDouble();
        try{
        System.out.println("Employee name: "+name+" and salary: "+checkSalary(salary));
        }
        catch(EmployeeSalaryException ex)
        {
            ex.printStackTrace();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
}
