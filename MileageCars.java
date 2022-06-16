package com.practise.carcompany;
import java.util.HashMap;
import java.util.*;

public class MileageCars {
	 Scanner sc=new Scanner(System.in);
		public void TypesOfKIA() {
			
		      HashMap<String,Integer> KIA=new HashMap<String ,Integer>();
		          KIA.put("SONET",1);
		          KIA.put("SELTOS",2);
		          KIA.put("CARNIVAL",3);
		          
		          System.out.println("These are the list of KIA Select one type from below: ");
		          System.out.println(KIA);
		           String s2=sc.next();
		           
		           for(Map.Entry<String,Integer> entry:KIA.entrySet())
		           {
		        	   if(s2.equals(entry.getKey()))
		        	   {
		        		   System.out.println("you have succesfully purchased " +s2);
		        		   KIA.replace(s2,(entry.getValue()-1));
		        	   }
		           }
		          System.out.println(KIA);
		        
		          
		}
		
		public void TypeOfHyundai()
		{
			HashMap<String,Integer> Hyundai =new HashMap<String ,Integer>();
			Hyundai.put("VENUE",7);
			Hyundai.put("CRETA",8);
			Hyundai.put("EV",9);
	        
	        System.out.println("These are the list of HYUNDAI Select one type from below:");
	        System.out.println(Hyundai);
	         String s2=sc.next();
	         
	         for(Map.Entry<String,Integer> entry:Hyundai.entrySet())
	         {
	      	   if(s2.equals(entry.getKey()))
	      	   {
	      		   System.out.println("you have succesfully purchased " +s2);
	      		 Hyundai.replace(s2,(entry.getValue()-1));
	      	   }
	         }
	        System.out.println(Hyundai);
			
			
		}
		
		
	}


