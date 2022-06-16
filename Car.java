package com.practise.carcompany;
import java.util.*;
public class Car {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
			ArrayList<String> al=new ArrayList<String>();
			al.add("KIA");
			al.add("Hyundai");
			ListOfCars obj1=new ListOfCars();
			        
					
			
				
					System.out.println("which car you want ? ");
					System.out.println(al);
					String s=sc.next();
					switch(s)
					{
					case "KIA":
					{
						
						
					obj1.KIA();
						break;
						
					}
					
					case "Hyundai":
					{
						obj1.Hyundai();
						break;
					}
					
					default:
					{
						System.out.println("please select only from above");
					}
					
					}
		
				
				

	}

}
