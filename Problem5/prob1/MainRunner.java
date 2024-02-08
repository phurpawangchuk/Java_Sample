package Problem5.prob1;

public class MainRunner {

	public static void main(String[] args) throws QueueException {
		ArrayQueueImpl q = new ArrayQueueImpl();
//		q.peek();
		//q.dequeue();
		
		for(int i = 0; i < 15; i ++) {
			q.enqueue(i);
			//System.out.println(i);
		}
		q.show();
		
		q.dequeue();
		q.dequeue();
		q.peek();
		
		System.out.println("\n");
		
		q.show();
		System.out.println("Peeked:"+q.peek());
	
		//for(int i = 0; i < 14; i ++)
			//q.dequeue();
		
		
		System.out.println("\n\nSize="+q.size());

	}

}
