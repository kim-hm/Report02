package porject15;

public class LinkedQ_Test {

	public static void main(String[] args) {
		char deletdItem;
		LinkedQueue LQ = new LinkedQueue();
		
		LQ.enQueue('A');
		LQ.printQueue();
		
		LQ.enQueue('B');
		LQ.printQueue();
		
		deletdItem = LQ.deQueue();
		if(deletdItem != 0)
				System.out.println(" deleted Item : " + deletdItem);
		LQ.printQueue();
		
		LQ.enQueue('C');
		LQ.printQueue();
		
		deletdItem = LQ.deQueue();
		if(deletdItem != 0)
			System.out.println(" deleted Item : " + deletdItem);
		LQ.printQueue();
		
		deletdItem = LQ.deQueue();
		if(deletdItem != 0)
			System.out.println(" deleted Item : " + deletdItem);
		LQ.printQueue();
		
		deletdItem = LQ.deQueue();
		if(deletdItem != 0)
			System.out.println(" deleted Item : " + deletdItem);
		LQ.printQueue();
	}

}
