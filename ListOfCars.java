package com.practise.carcompany;

import java.util.ArrayList;
import java.util.*;
public class ListOfCars {
	Scanner sc=new Scanner(System.in);
	 MileageCars obj=new MileageCars();
	public void KIA()
	{
		ArrayList<String> KIA=new ArrayList<String>();
		KIA.add("SONET");
		KIA.add("CARNIVAL");
		KIA.add("SELTOS");
		
		System.out.println(KIA);
		System.out.println("please select type of car you want:");
		  String s1=sc.next();
		switch(s1) 
		{
		case "SONET":
		{
			obj.TypesOfKIA();
			break;
			
		}
		case "CARNIVAL":
		{
			
			break;
		}
		case "SELTOS":
		{
		
			break;
		}
			
		
		default:
		{
			System.out.println("please select only from above");
			
			
		}
		
		}
		
		
	}
	
		public void Hyundai()
		{
			ArrayList<String> Hyundai=new ArrayList<String>();
			Hyundai.add("venue");
			Hyundai.add("creta");
			Hyundai.add("EV");
			
			System.out.println(Hyundai);
			System.out.println("please select type of car you want:");
			  String s2=sc.next();
			switch(s2) 
			{
			case "Venue":
			{
				obj.TypeOfHyundai();
				break;
				
			}
			case "creta":
			{
				
				break;
				
			}
			case "EV":
			{
			
				break;
			}
				
			
				
			
			default:
			{
				System.out.println("please select only from above");
				
				
			}
			}
		}
}
			
			
		
		
			
		
		
	






