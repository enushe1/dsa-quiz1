import java.util.Stack;

public class Main {
	public class LinearQueue<T>{
	private T[] Queue;
	private int front;
	private int rear;
	private int size;
	
public LinearQueue(int capacity) {
	Queue = (T[]) new Object[capacity];
	front = 0;
	rear = -1;
	size = 0;
}
public boolean isEmpty() {
	return size == 0;
	
}
public boolean isFull() {
	return size == Queue.length;
}
public void enqueue(T item) {
	if (isFull()) {
		throw new IllegalStateException("Queue is full");
	}
	rear= (rear + 1)% Queue.length;
	Queue[rear] = item;
	size++;
}
public T dequeue() {
	if(isEmpty()) { 
		throw new IllegalStateException("Queue is empty");
	}
	T item = Queue[front];
	front = (front + 1)% Queue.length;
	size--;
		
	return item;
}
public T peek() {
	if(isEmpty()) {
		throw new IllegalStateException("Queue is empty");
	}
	
	return Queue[front];
}
public int size() {
	return size;
}
}
	
	
	
public class CircularQueue {
		private int[] queue;
		private int front;
		private int rear;
		private int size;
public CircularQueue(int capacity) {
		queue = new int[capacity];
		front= -1;
		rear= -1;
		size = capaity;	
	}
public boolean enqueue(int element) {
	if((rear +  1)% size ==front) {
		return false;
		}
		
	if(front == -1) {
			front = 0;
	}
	rear = (rear + 1)%size;
	queue[rear] = element;
	return true;
	}
public int dequeue() {
	if(front == -1) {
		return -1;
	}
			
	}
	int element =queue[front];
	if(front== rear) {
			front = -1;
			rear= -1;
	}else {
	front =( front + 1)%size;
		}
	return element;
}
public int peek() {
	if(front == -1) {
		return -1;	
	}
	return queue[front];
}
public boolean isEmpty() {
	return front == -1;
}
public boolean isFull()	{
	return(rear + 1)%size == front;
	
}
}
public class LinearQueue<T>{
	private Stack<T>enqueueStack;
	private Stack<T>dequeueStack;
	public LinearQueue() {
		enqueueStack = newStack<>();
		dequeueStack = newStack<>();
		public void enqueue(T element) {
			enqueue.Stack.push(element)
		}
		public T dequeue() {
			if(dequeueStack isEmpty()) {
				while(lenqueueStack.isEmpty()) {
					dequeueStack.push(enqueueStack.pop());
				}
			}
			return dequeueStack.pop();
		}
		public boolean isEmpty() {
			return enqueueStack.isEmpty()&&dequeueStack.isEmpty()
		}
	}
}
		

	
