package com.java.container;

public class ChemicalElement implements Comparable<ChemicalElement> {
	private int AutomicNumber;
	   private String AutomicName;
	   private String AutomicFormula;
	  private Double Automicweigth;

   
   public int compareTo(ChemicalElement o)
   {
   	// TODO Auto-generated method stub
	   System.out.println("Comparing "+AutomicFormula+"....with....."+o.AutomicFormula);
   	return AutomicFormula.compareTo(o.AutomicFormula);
   }


public ChemicalElement(int automicNumber, String automicName, String automicFormula, double automicweigth) {
	super();
	AutomicNumber = automicNumber;
	AutomicName = automicName;
	AutomicFormula = automicFormula;
	Automicweigth = automicweigth;
}





@Override
public String toString() {
	return "ChemicalElement [AutomicNumber=" + AutomicNumber + ", AutomicName=" + AutomicName + ", AutomicFormula="
			+ AutomicFormula + ", Automicweigth=" + Automicweigth + "]";
}


   
}
