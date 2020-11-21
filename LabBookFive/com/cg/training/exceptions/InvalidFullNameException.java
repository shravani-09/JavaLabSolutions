/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cg.training.exceptions;

/**
 *
 * @author LENOVO
 */
public class InvalidFullNameException extends Exception {

    public InvalidFullNameException(String messge) {
        super(messge);
        System.out.println(messge);
    }
    
    
}
