package com.greatlearning.FloorAssembly.Service;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;


public class UseQueueStack {
	
		Queue<Integer> queue;
		Stack<Integer> stack;
		public UseQueueStack()
		{
		 queue=new LinkedList<Integer>();
		 stack=new Stack<>();
		 }

public void queue_enqueue(int data)
{queue.add(data);}
public void stack_push(int data)
{stack.push(data);}
public int queue_dequeue()
{return queue.remove();}
public int stack_pop()
{return stack.pop();}
public int stack_peek()
{return stack.peek();}
public boolean stack_isEmpty()
{return stack.size()==0;}
public int queue_peek()
{	return queue.peek();
}
public boolean queue_checkduplicate(int floorsize)
{
	return queue.contains(floorsize);
}
}

