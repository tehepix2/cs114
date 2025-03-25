package queues;

public class AQueue<E> implements QueueADT<E> {
	private E queueArray[]; // Array holding queue elements
	private static final int DEFAULT_SIZE = 10;
	private int maxSize; // Maximum size of queue
	public int front; // Index of front element
	public int rear; // Index of rear element

	// Constructors
	@SuppressWarnings("unchecked") // Generic array allocation
	public
	AQueue(int size) {
		maxSize = size + 1; // One extra space is allocated
		rear = 0;
		front = 1;
		queueArray = (E[]) new Object[maxSize]; // Create queueArray
	}

	public AQueue() {
		this(DEFAULT_SIZE);
	}

	// Reinitialize
	public void clear() {
		rear = 0;
		front = 1;
	}

	// Put "it" in queue
	public boolean enqueue(E it) {
		if (((rear + 2) % maxSize) == front) {
			return false; // Full
		}
		rear = (rear + 1) % maxSize; // Circular increment
		queueArray[rear] = it;
		return true;
	}

	// Remove and return front value
	public E dequeue() {
		if (length() == 0) {
			return null;
		}
		E it = queueArray[front];
		front = (front + 1) % maxSize; // Circular increment
		return it;
	}

	// Return front value
	public E frontValue() {
		if (length() == 0) {
			return null;
		}
		return queueArray[front];
	}

	// Return queue size
	public int length() {
		return ((rear + maxSize) - front + 1) % maxSize;
	}

	// Tell if the queue is empty or not
	public boolean isEmpty() {
		return front - rear == 1;
	}
}