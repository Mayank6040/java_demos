package com.House.www;

public class Showers implements gadgets
{
	String name;
	boolean sw;
	 public void status()
		{
		 if(sw==true)
		 {
		System.out.println("Showers is ON");
		 }
		 else
			 {
			 System.out.println("Showers is off");
			 }
		}
	 public Showers( String n)
	 {
		 name=n;
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
