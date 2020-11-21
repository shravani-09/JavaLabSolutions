/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cg.training.client;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class NextConsonantsTester {
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String inp=sc.next();
		String res=alterString(inp);
		System.out.println(inp+"|"+res);
		

	}

	public static String alterString(String inp) {
		// TODO Auto-generated method stub
		char[] ab=inp.toCharArray();
		for(int i=0;i<ab.length;i++)
		{
			if(ab[i]!='a' && ab[i]!='e' && ab[i]!='i' && ab[i]!='o' && ab[i]!='u' )
			{
				ab[i]=(char)(ab[i]+1);
			}
		}
		inp=String.valueOf(ab);
		return inp;
	}
}
