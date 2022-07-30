package com.greatlearning.FloorAssembly.Service;

public class OrderOfConstruction {
	public static int setOrder(UseQueueStack assemble_floor,int expected_floor)
	{
		
	if(assemble_floor.queue_peek()==expected_floor)
		{
			assemble_floor.stack_push(assemble_floor.queue_dequeue());
			while(true)
			{
				int x=assemble_floor.stack_pop();
				System.out.print(x+" ");
				expected_floor--;
				if(assemble_floor.stack_isEmpty()||(x-assemble_floor.stack_peek())!=1)
				    break;
			}
			System.out.println();
		}
		else
		{   System.out.println();
			assemble_floor.stack_push(assemble_floor.queue_dequeue());
		}
	    return expected_floor;
		}
}
