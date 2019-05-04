package com.House.www;

import java.util.Scanner;

public class home
{

	int rooms;
	String housename;
	public home(String a)
	{
		housename=a;
		rooms=0;
	}
	
	room[] arr = new room[10];

	
	
	public void addroom()           ////add to gadget array, which is of size 10
	{
		
	
		if(rooms==10)
		{
			System.out.println("no more rooms can be added");
		}
		else
		{
		System.out.println("***************rooms LIST*************************");
		Scanner sc= new Scanner(System.in);
		

		System.out.println("1.Kitchen");
		System.out.println("2.Dining area");
		System.out.println("3.Living area");
		System.out.println("4.bedroom");
		System.out.println("5.washroom");
		System.out.println("6.porch ");
		System.out.println("7.Terrace ");
		System.out.println("8.corridors ");
		System.out.println("enter type of room:");
		int ch= sc.nextInt();
		
		switch(ch)
		{
		case 1:
			arr[rooms]=new room("Kitchen");
			System.out.println("ROOM type kitchen added");
			arr[rooms].addgadgets();
			rooms++;
			break;	
		case 2:
			arr[rooms]=new room("Dining area");
			System.out.println("ROOM type dining area added");
			arr[rooms].addgadgets();
			rooms++;
			break;	
		case 3:
			arr[rooms]=new room("Living area");
			System.out.println("ROOM type living area added");
			arr[rooms].addgadgets();
			rooms++;
			break;	
		case 4:
			arr[rooms]=new room("BEDROOM");
			
			System.out.println("ROOM type bedroom added");
			arr[rooms].addgadgets();
			rooms++;
			break;	
		case 5:
			arr[rooms]=new room("WASHROOM");
			
			
			System.out.println("ROOM type washroom added");
			arr[rooms].addgadgets();
			rooms++;
			break;	
		case 6:
			arr[rooms]=new room("PORCH");
			System.out.println("ROOM type porch added");
			arr[rooms].addgadgets();
			rooms++;
			
			break;	
		
		case 7:
			arr[rooms]=new room("TERRACE");
			System.out.println("ROOM type terrace added");
			arr[rooms].addgadgets();
			rooms++;
			break;
			

		case 8:
			arr[rooms]=new room("CORRIDOR");
			System.out.println("ROOM type corridor added");
			arr[rooms].addgadgets();
			rooms++;
			break;
			
		default:
				
			System.out.println("ROOM TYPE NOT AVAILABLE");
			break;
			} 
		
		
	}//else

	}

		
		
	
	public void showrooms()
	{
		System.out.println("List of roomsss");
		for(int i=0;i<rooms;i++)
		{
			System.out.println("in for");
			if(arr[i]==null){

				System.out.println("it is null value");
			}
			else{
				System.out.println("in else");
				System.out.println(arr[i].getname());
			
				arr[i].showgadgets();
			}			
		}
		
		System.out.println("after for");
		
	}

}