package com.House.www;

public class lights implements gadgets
{
	boolean sw;
	String name;
	 public void status()
		{
		 if(sw==true)
		 {
		System.out.println("lights is ON");
		 }
		 else
			 {
			 System.out.println("lights is off");
			 }
		}
	 public lights(String a)
	 {
		 this.sw=set_off;
		 name=a;
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
