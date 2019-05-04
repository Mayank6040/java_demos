package com.House.www;

public class doors implements gadgets   
{
	String name;
	boolean sw;
	 public void status()
		{
		 if(sw==true)
		 {
		System.out.println("doors is ON");
		 }
		 else
			 {
			 System.out.println("doors is off");
			 }
		}
	 public doors(String n)
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

