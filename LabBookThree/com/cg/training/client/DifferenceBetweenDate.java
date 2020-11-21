/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cg.training.client;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class DifferenceBetweenDate {
    public static void main(String[] args) {
        LocalDate pdate = LocalDate.of(2012, 01, 01);
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(pdate, now);
 
     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
    }
}
