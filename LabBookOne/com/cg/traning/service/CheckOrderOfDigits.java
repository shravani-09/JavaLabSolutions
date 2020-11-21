/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cg.traning.service;

/**
 *
 * @author LENOVO
 */
public class CheckOrderOfDigits {
        public static boolean increasingDigits(int input)
            {

                if (input < 0)
                    input = -input;

                int lastSeen = 10; 
                int current;

                while (input > 0) {
                    current = input % 10;
                    if (lastSeen < current)
                        return false;
                    lastSeen = current;
                    input /= 10;
                }
                return true;
            }
}
