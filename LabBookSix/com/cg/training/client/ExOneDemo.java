package com.cg.training.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.cg.training.service.ProductExOne;

public class ExOneDemo 
{
	private static Map<Integer, ProductExOne> productListMap=new HashMap<Integer, ProductExOne>();
	
	private static Scanner scanner= new Scanner(System.in);
	
	public static class ComparePrice implements Comparator<ProductExOne>
	{

		@Override
		public int compare(ProductExOne p1, ProductExOne p2) {
			
			return p1.getProductPrice().compareTo(p2.getProductPrice());
		}
		
		
	}
	
	public static void getValues(List<ProductExOne> productList)
	{
		ComparePrice comparePrice=new ComparePrice();
		
		Collections.sort(productList, comparePrice);
		
		System.out.println(productList.size());
		
		for(ProductExOne p:productList)
		{
			
			System.out.println(p);
		}

//		productList.stream().forEach(System.out::println);
		
	}
	
	private static List<ProductExOne> addDetails(ProductExOne product) {
		
		System.out.println("enter the product name");
		product.setProductName(scanner.nextLine());
		System.out.println("enter the product id");
		product.setProductId(Integer.parseInt(scanner.nextLine()));
		System.out.println("enter the product price");
		product.setProductPrice(Double.parseDouble(scanner.nextLine()));

		productListMap.put(product.getProductId(), product);
		
		List<ProductExOne> productArrayList=new ArrayList<ProductExOne>();
		
		for(Map.Entry<Integer, ProductExOne> p:productListMap.entrySet())
		{
			
			productArrayList.add(p.getValue());
		
		}
		return productArrayList;
		
	}
	
	public static void main(String[] args) {
		
		List<ProductExOne> productList=new ArrayList<ProductExOne>();
		while(true)
		{
			ProductExOne product =new ProductExOne();
			
			productList=addDetails(product);	
			
			System.out.println("Do you want to add more products (Y/N)?");
			String option=scanner.nextLine();
			if(!option.equalsIgnoreCase("Y"))
			{
				break;
			}
		}
		
		getValues(productList);
		

	}

	

}
