
class Queue {
	private static int top, bottom, total;
	private static int queue[];
	
	Queue(int size){
		top = bottom = 0;
		total = size;
		queue = new int[total];
	}
	
	static void enQueue(int item) {
		if(total == bottom) {
			System.out.println("Error! Queue is full.");
			return;
		}
		else {
			queue[bottom] = item;
					bottom++;
		}
		return;
	}
	
	static void deQueue() {
		if(top == bottom) {
			System.out.println("Error! Queue is empty.");
			return;
		}
		else {
			for(int i = 0; i < bottom - 1; i++) {
				queue[i] = queue[i+1];
			}
		if(bottom < total) {
			queue[bottom] = 0;
		}
			bottom--;
			
		}
		return;
	}
	
	static void queueDisplay() {
		if(top == bottom) {
			System.out.println("Queue is empty.");
			return;
		}
		for(int i = top; i < bottom; i++) {
			System.out.print(queue[i] + " ");
		}
		System.out.println("");
	}
	
	static void queueFront() {
		if(top == bottom) {
			System.out.println("Queue is empty.");
			return;
		}
		System.out.println("Top of the queue is: " + queue[top]);
		return;
	}
	
	
}
