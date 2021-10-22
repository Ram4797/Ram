package com.java.container;

import java.util.Iterator;
import java.util.TreeSet;



public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("....Cntainer Is Ready....");
		
		ChemicalElement c=new ChemicalElement(10, "Neon","ne", 20.180);
		
		ChemicalElement c1=new ChemicalElement(15, "Phosphours","p", 30.974);
		
		ChemicalElement c2=new ChemicalElement(8, "Oxygen","o", 15.999);
		
		ChemicalElement c3=new ChemicalElement(20, "Calcium","Ca", 40.078);
		
		ChemicalElement c4=new ChemicalElement(5, "Boron","B", 10.81);
		
		ChemicalElement c5=new ChemicalElement(9, "Fluorine","F", 18.998);
		
		ChemicalElement c6=new ChemicalElement(13, "Aluminium","Au", 26.98154);
         TreeSet<ChemicalElement>t=new TreeSet<ChemicalElement>();
         System.out.println("...Adding First Element...");
         t.add(c);
         System.out.println("...Adding 2nd Element...");
         t.add(c1);
         System.out.println("...Adding 3rd Element...");
         t.add(c2);
         System.out.println("...Adding 4th Element...");
         t.add(c3);
         System.out.println("...Adding 5th Element...");
         t.add(c4);
         System.out.println("...Adding 6th Element...");
         t.add(c5);
         System.out.println("...Adding 7th Element...");
         t.add(c6);
         Iterator<ChemicalElement> PerodicElement=t.iterator();
         while(PerodicElement.hasNext())
         {
        	 ChemicalElement Element=PerodicElement.next();
        	 System.out.println("Element......"+Element);
         }
         
         
	}

}
