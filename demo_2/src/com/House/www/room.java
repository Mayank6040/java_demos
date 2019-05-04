
package com.House.www;

import java.util.Scanner;
public class room
{
	String name;
	int devices;
	gadgets[] arr = new gadgets[10];

	public room(String a)      //constructor
	
	{
	   	this.name=a;
		devices=0;
		
	}
	public String getname()          //show room name
	
	{
		return name;
	}
	
	public void addgadgets()           ////add to gadget array, which is of size 10
	{
		
	
		if(devices==10)
		{
			System.out.println("no more devices can be added");
		}
		else
		{
		System.out.println("***************GADGETS LIST*************************");
		Scanner s= new Scanner(System.in);
		
		gadgets a;

		System.out.println("1.AIR CONDITIONER");
		System.out.println("2.LIGHTS");
		System.out.println("3.TELEVISION");
		System.out.println("4.DOORS");
		System.out.println("5.SHOWERS");
		System.out.println("6.ELECTRONIC DEVICES");
		System.out.println("enter gadget to be added");
		int ch= s.nextInt();
		System.out.println("test");
		switch(ch)
		{
		case 1:
			System.out.println("in switch");
			arr[devices]=new air_conditioner("AC");
			
			devices++;
			break;	
		case 2:
			a=new lights("LIGHTS");
			arr[devices]=a;
			devices++;
			break;	
		case 3:
			a=new Television("TV");
			arr[devices]=a;
			devices++;
			break;	
		case 4:
			a=new doors("AUTOMATIC DOORS");
			arr[devices]=a;
			devices++;
			break;	
		case 5:
			a=new Showers(" SHOWERS");
			arr[devices]=a;
			devices++;
			break;	
		case 6:
			a=new Electronic_devices("ELECTRONIC DEVICES");
			arr[devices]=a;
			devices++;
			break;	
		default:
			System.out.println("Device not found,add device");
			break;
			}   //sw
		
	}//else
	
}//function close
public void showgadgets()
	{System.out.println("List of devices in room");
		for(int i=0;i<devices;i++)
		{

			System.out.println(arr[i].getname());
			
			arr[i].status();
			
				
		}
	}

}