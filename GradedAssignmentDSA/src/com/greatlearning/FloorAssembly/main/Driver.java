package com.greatlearning.FloorAssembly.main;
import java.util.Scanner;
import com.greatlearning.FloorAssembly.Service.UseQueueStack;
import com.greatlearning.FloorAssembly.Service.OrderOfConstruction;
public class Driver {
	static int expected_floor=0;
	static Scanner sc=new Scanner(System.in);
	public static void set_expected_floor(int size)
	{
		expected_floor=size;
	}
	public static void acceptFloorsize(UseQueueStack assemble_floor,int size)
	{   
		int floorsize;
		for(int i=1;i<=size;i++)
		 {
			 System.out.println("Enter the floor size given on day "+(i));
			 floorsize=sc.nextInt();
		   try {
			     if(floorsize==0 || floorsize>size ||assemble_floor.queue_checkduplicate(floorsize))
			     { 
			    	 throw new ArithmeticException("Incorrect Floor size entered!Enter floorsize again!!!");
			     }
			     assemble_floor.queue_enqueue(floorsize);
		        }
		   catch(ArithmeticException e)
		   {
			   System.out.println(e.getMessage());
			   i--;
		   }
		       
	    	
		 }//end for
}
	
	public static void main(String args[])
	{
		 UseQueueStack assemble_floor=new UseQueueStack();
		 
		 System.out.println("Enter the total no of floors in the building");
		 int size=sc.nextInt();
		 set_expected_floor(size);
		 acceptFloorsize(assemble_floor,size);
		 
		 System.out.println("Order of construction ");
		for(int i=1;i<=size;i++)
		 {
			 System.out.println("day :"+(i));
			 expected_floor=OrderOfConstruction.setOrder(assemble_floor,expected_floor);
		 }
		sc.close();
	 }
	
	}
		 
	


