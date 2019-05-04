package com.House.www;
public class Electronic_devices implements gadgets
{
	String name;
	boolean sw;
	 public void status()
		{
		 if(sw==true)
		 {
		System.out.println("Electronic_devices is ON");
		 }
		 else
			 {
			 System.out.println("Electronic_devices is off");
			 }
		}
	 public Electronic_devices(String a)
	 {
		  	this.name=a;
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
