package Problem5.prob1;

import java.lang.reflect.UndeclaredThrowableException;

public class ArrayQueueImpl {

	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;
	
	public int peek() throws QueueException{
		if(isEmpty())
			 throw new QueueException("Queue is empty");
		if(rear ==0 || front == -1)
			 throw new QueueException("Queue is empty");
		
		//System.out.print("PP="+arr[rear]+" "+rear);
		
		return arr[rear-1];
		//implement
	}
	
	public void enqueue(int obj){
		//implement
		if(front == -1)
			front++;
		
	   if(isFull()) {
		   reSize();
	   }else {
		   arr[rear++] = obj;
	   }
		
	}
	
	private void reSize() {
		int[] temp = new int[2*arr.length];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
		
	}

	public int dequeue() throws QueueException {
		
		if(isEmpty()) {
			throw new QueueException("Quese is empty");
			
		}
		return arr[front++];
		//implement
	}
	
	public boolean isEmpty(){	
		//implement
		if(front == -1) return true;
		if(front >= rear) return false;
		
		return false;
	}
	
	public boolean isFull() {
		if(rear == arr.length) {
			return true;
		}
		return false;
		
	}
	
	public int size(){	
		//implement
		if(isEmpty())
			return 0;
		
		return rear-front;
	}

	public void show() {

		for(int i=front; i< rear; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	
}
