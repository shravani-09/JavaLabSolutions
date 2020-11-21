/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cg.training.client;

import com.cg.training.exceptions.InvalidFullNameException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author LENOVO
 */
public class ValidateName {
    
    
    public static boolean validateFullName(String fullName) throws InvalidFullNameException
    {
        
        Pattern pattern = Pattern.compile("^[a-zA-Z]{4,}(?: [a-zA-Z]+){2}$");
        Matcher matcher = pattern.matcher(fullName);
        boolean found = matcher.find();
        if (found)
        return found;
        else 
        throw new InvalidFullNameException("please enter valid full name");
        
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you full name");
        String fullName=sc.nextLine();
        try{
        System.out.println(ValidateName.validateFullName(fullName));
        }
        catch(InvalidFullNameException ex)
        {
            ex.printStackTrace();
            
        }
         catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
