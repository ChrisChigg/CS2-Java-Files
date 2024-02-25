
public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(5);
		System.out.println("Current Queue: ");
		q.queueDisplay();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		q.queueDisplay();

	}

}
