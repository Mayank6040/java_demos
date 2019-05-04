package com.House.www;

public class Television implements gadgets {
	boolean sw;
	String name;
	 public void status()
		{
		 if(sw==true)
		 {
		System.out.println("Television is ON");
		 }
		 else
			 {
			 System.out.println("Television is off");
			 }
		}
	 public Television(String a)
	 {
		 name=a;
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
