package com.House.www;

public class air_conditioner implements gadgets 
{
	boolean sw;
	String name;
	 public void status()
		{
		 if(sw==true)
		 {
		System.out.println("AC is ON");
		 }
		 else
			 {
			 System.out.println("AC is off");
			 }
		}
	
	 public air_conditioner(String n)
	 {
		 this.name=n;
		 this.sw=set_off;
	 }

	 public String getname()
	 {
		 return name;
	 		}

	 public void  turnon()
	 {
		 this.sw=set_on;
	 }
	 public void  turnoff()
	 {
		 this.sw=set_off;
	 }
}
