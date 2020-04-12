package project14;

public class ArrayQueuemain {

		public static void main(String[] args) {

			ArryQueue<String> queue = new ArryQueue<String>();

			queue.add("apple");  queue.add("orange");
			queue.add("cherry");  queue.add("pear");  queue.print();

			queue.remove();  queue.print();

			queue.add("grape");  queue.print();

			queue.remove();  queue.print();

			queue.add("lemon");  queue.print();
			queue.add("mango");  queue.print();
			queue.add("lime");  queue.print();
			queue.add("kiwi");  queue.print();

			queue.remove();  queue.print();
		}
	}