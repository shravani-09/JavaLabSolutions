
package com.cg.training.client;

import com.cg.training.service.RemoveDuplicate;
import java.util.Scanner;

public class ExampleFourTester {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array that is to be created::");
      int size = sc.nextInt();
      int[] myArray = new int[size];
      System.out.println("Enter the elements of the array ::");

      for(int i=0; i<size; i++) {
         myArray[i] = sc.nextInt();
      }
       
      size =RemoveDuplicate.removeDuplicateElements(myArray, size);
   
        // updated array 
        System.out.println("Removed duplicate elements from array");
        for (int i=0; i<size; i++) 
           System.out.print(myArray[i]+" "); 
      // reverse sorting of array
      RemoveDuplicate.sortDescendingOrder(myArray, size);
      
    }
}
