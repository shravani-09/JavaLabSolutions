package com.cg.training.client;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExOneDemo
{
            public static void main(String args[])throws IOException
            {
                        int j=1;
                        char ch;
                        Scanner scr=new Scanner(System.in);
                        //System.out.print("\nEnter File name: ");
                       // String str=scr.next();
                        FileInputStream f=new FileInputStream("F:\\Lab Assignment\\source.txt");
                        System.out.println("\nContents of the file are");
                        int n=f.available();
                        System.out.print(j+": ");
                        for(int i=0;i<n;i++)
                        {
                                    ch=(char)f.read();
                                    System.out.print(ch);
                                    if(ch=='\n')
                                    {
                                                System.out.print(++j+": ");
                                               
                                    }
                                               
                        }
            }
}
